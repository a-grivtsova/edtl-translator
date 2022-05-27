package su.nsk.iae.edtl.generator.verifier.common

import su.nsk.iae.edtl.generator.IEdtlGenerator
import su.nsk.iae.edtl.edtl.Model
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import su.nsk.iae.edtl.generator.verifier.helpers.ExpressionGenerationHelper
import su.nsk.iae.edtl.edtl.Requirement
import java.util.ArrayList
import su.nsk.iae.edtl.edtl.VarDeclaration
import su.nsk.iae.edtl.edtl.DeclVarInput
import su.nsk.iae.edtl.edtl.DeclVarOutput
import su.nsk.iae.edtl.generator.verifier.util.LiteralUtils

class VerifierFileGenerator implements IEdtlGenerator{
	static final int MAX_FSMS = 10;
	IFileSystemAccess2 fsa
	ExpressionGenerationHelper expressionGenerator
	ArrayList<Requirement> requirements
	ArrayList<VarDeclaration> inputVariables
	ArrayList<VarDeclaration> outputVariables
	String inputPortsCounter
	String outputPortsCounter
	
	def String getRootDirName() {
		return "verifier"
	}
	
	override setModel(Model model){}
	
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.fsa = fsa
		expressionGenerator = new ExpressionGenerationHelper()
		
		requirements = new ArrayList<Requirement>()
		inputVariables = new ArrayList<VarDeclaration>()
		outputVariables = new ArrayList<VarDeclaration>()
		
		input.allContents.filter(Requirement).forEach [v | requirements.add(v)]
		
		input.allContents.toIterable.filter(DeclVarInput).map[varDecls].get(0).forEach [v | inputVariables.add(v)]
		input.allContents.toIterable.filter(DeclVarOutput).map[varDecls].get(0).forEach [v | outputVariables.add(v)]
		
		inputPortsCounter = input.allContents.toIterable.filter(Model).get(0).declVarInput.get(0).inputCounter
		outputPortsCounter = input.allContents.toIterable.filter(Model).get(0).declVarOutput.get(0).outputCounter
		
		for (resource : VerifierResourceProvider.COMMON_RESOURCES) {
			fsa.generateFile('''«rootDirName»/«resource»''', class.getResourceAsStream('''/resources/«resource»'''))
		}
	}
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generateVM_constantsFile
		generateConstantsFile
		generateEdtlFunctionsFile
		generateVariablesHandlerFile
		generateVMportsFile
		generateVM_dbsFile
		generateVM_variablesFile
	}
	
	def generateEdtlFunctionsFile() {			
		var fileContent = '''
		#include "EdtlFunctions.h"
		
		void calculate(VerificationFSM *fsm, std::map <std::string, PortVariable*> &v, uint8_t id) {
					EdtlAttributes edtlAttributes;
					
					switch (id) {
						«FOR requirement: requirements.indexed»
						case «requirement.key» : {
							edtlAttributes.trigger = «expressionGenerator.translateExpr(requirement.value.getTrigExpr())»;
							edtlAttributes.invariant = «expressionGenerator.translateExpr(requirement.value.getInvExpr())»;
							edtlAttributes.final = «expressionGenerator.translateExpr(requirement.value.getFinalExpr())»;
							edtlAttributes.delay = «expressionGenerator.translateExpr(requirement.value.getDelayExpr())»; 
							edtlAttributes.reaction = «expressionGenerator.translateExpr(requirement.value.getReacExpr())»;
							edtlAttributes.release = «expressionGenerator.translateExpr(requirement.value.getRelExpr())»;
							break;
						}
						«ENDFOR»
						default: {
							break;
						}
					}
					fsm->set(edtlAttributes);
				};
		'''
		fsa.generateFile('''«rootDirName»/EdtlFunctions.cpp''', fileContent)
	}
	
	def generateVariablesHandlerFile() {
		var fileContent = '''
			#include "VariablesHandler.h"
			void setVariables(std::map <std::string, PortVariable*> &v) {
				«FOR v: inputVariables»
				v["«v.v.name»"] = new PortVariable(aInput, «LiteralUtils.getPortIndex(v.location)», «v.type == 'BOOL' ? LiteralUtils.getBitIndex(v.location) : '8'»);
				«ENDFOR»
				«FOR v: outputVariables»
				v["«v.v.name»"] = new PortVariable(aOutput, «LiteralUtils.getPortIndex(v.location)», «v.type == 'BOOL' ? LiteralUtils.getBitIndex(v.location) : '8'»);
				«ENDFOR»
			}
		'''
		fsa.generateFile('''«rootDirName»/VariablesHandler.cpp''', fileContent)
	}
	
	def generateConstantsFile() {
		var fileContent = '''
			#ifndef CONSTANTS_H
			#define CONSTANTS_H
			
			#define INPUT_PORTS_COUNTER «inputPortsCounter»
			#define OUTPUT_PORTS_COUNTER «outputPortsCounter»
			#define REQUIREMENT_COUNTER «requirements.size»
			#define MAX_FSMS «MAX_FSMS»
			
			#endif
		'''
		fsa.generateFile('''«rootDirName»/constants.h''', fileContent)
	}
	
	def generateVMportsFile() {
		var fileContent =  '''
		
			#define INPUT_PORT «inputPortsCounter»
			#define OUTPUT_PORT «outputPortsCounter»
		'''
		fsa.generateFile('verifier/VMports.h', fileContent)
	}	
	
	def generateVM_constantsFile() {
		var fileContent =  '''
			SCM2VM_FINISH_VERIFICATION = 0
			VM2SCM_START_VERIFICATION = 0
			VM2GUI_END_VERIFICATION = 0
			«FOR requirement: requirements.map[name].indexed»
			VM2GUI_TEST_PASSED_«requirement.value.toUpperCase» = «2*requirement.key + 1»
			VM2GUI_TEST_FAILED_«requirement.value.toUpperCase» = «2*requirement.key + 2»
			«ENDFOR»
		'''
		fsa.generateFile('''«rootDirName»/cfg/VM_constants.cfg''', fileContent)
	}
	
	def generateVM_dbsFile() {
		var fileContent =  '''
			«FOR reqName: requirements.map[name]»
			 «reqName.toUpperCase»
			«FOR i: 0 ..< MAX_FSMS»
			«i+1»
			«ENDFOR»
			«ENDFOR»
		'''
		fsa.generateFile('''«rootDirName»/cfg/VM_dps.dbg''', fileContent)
	}
	
	def generateVM_variablesFile() {
		var fileContent =  '''
			«FOR variable: inputVariables»
			INPUT «expressionGenerator.generateCfgVariable(variable)»
			«ENDFOR»
			«FOR variable: outputVariables»
			INPUT «expressionGenerator.generateCfgVariable(variable)»
			«ENDFOR»
		'''
		fsa.generateFile('''«rootDirName»/cfg/VM_variables.var''', fileContent)
	}
		
}