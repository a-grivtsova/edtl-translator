package su.nsk.iae.edtl.generator.verifier.helpers

import su.nsk.iae.edtl.edtl.PrimaryExpression
import su.nsk.iae.edtl.edtl.CompExpression
import org.eclipse.emf.ecore.EObject
import su.nsk.iae.edtl.edtl.UnExpression
import su.nsk.iae.edtl.edtl.EquExpression
import su.nsk.iae.edtl.edtl.AndExpression
import su.nsk.iae.edtl.edtl.XorExpression

import su.nsk.iae.edtl.generator.verifier.util.LiteralUtils
import su.nsk.iae.edtl.edtl.VarDeclaration
import su.nsk.iae.edtl.edtl.Expression

class ExpressionGenerationHelper {
	static def boolean isConst(PrimaryExpression e) {
		return e.getConst !== null
	}

	static def boolean isTau(PrimaryExpression e) {
		return e.getTau !== null
	}	

	static def boolean isNestExpr(PrimaryExpression e) {
		return e.getNestExpr !== null
	}
	
	static def boolean isCrossVarAbbr(PrimaryExpression e) {
		return e.getV !== null
	}
	
	static def boolean isCompOp(CompExpression e) {
		return e.getCompOp !== null
	}
	
	static def String translateCompExpression(CompExpression expr) { 
		if(expr.isCompOp)
			return '''«expr.getCompOp.getLiteral»'''		
	}
	
	def String translateExpr(EObject expr) {
		switch (expr) {
			PrimaryExpression: {
				if(expr.isNestExpr) {
					return '''(«translateExpr(expr.getNestExpr)»)'''
				}
				if(expr.isConst) {
					return '''«expr.getConst»'''		
				}
				if(expr.isCrossVarAbbr) {
					return '''v["«expr.getV.getName»"]'''	
				}
				if(expr.isTau) {
					return '''tau(fsm->getTime(), «LiteralUtils.parseTime(expr.getTau.getTime.getInterval)»)'''	
				}
				return 'unknown'
	    	}
			UnExpression:
				if(expr.unOp == 'NOT')
					return '''!«translateExpr(expr.right)»'''
				else 
					return '''«expr.unOp.toLowerCase»(«translateExpr(expr.right)»)'''
			EquExpression:
				return '''«translateExpr(expr.left)» == «translateExpr(expr.right)»'''
			CompExpression: 
				return '''«translateExpr(expr.left)» «translateCompExpression(expr)» «translateExpr(expr.right)»'''
			AndExpression:
				return '''«translateExpr(expr.left)» && «translateExpr(expr.right)»'''
			XorExpression:
				return '''«translateExpr(expr.left)» ^ «translateExpr(expr.right)»'''
			Expression:
				return '''«translateExpr(expr.left)» || «translateExpr(expr.right)»'''
			default:
				return 'default'
		}
	}
	
	def String generateCfgVariable(VarDeclaration v) {
		return v.type == 'BOOL'
			? '''LOG «v.v.name» «LiteralUtils.getPortIndex(v.location)» «LiteralUtils.getBitIndex(v.location)»'''
			: '''INT «v.v.name» «LiteralUtils.getPortIndex(v.location)»'''
	}
}