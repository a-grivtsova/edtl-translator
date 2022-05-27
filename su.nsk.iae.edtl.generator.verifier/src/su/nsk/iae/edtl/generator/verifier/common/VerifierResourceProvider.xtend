package su.nsk.iae.edtl.generator.verifier.common

import java.util.List

class VerifierResourceProvider {
	public static final List<String> COMMON_RESOURCES = newArrayList("InterfaceDll.cpp", 
	"InterfaceDll.h", "EdtlFunctions.h", "LabVIEWData.h", "lib.h",
		"lib.cpp", "Logger.h", "Logger.cpp", "MsgFunctions.cpp", "MsgFunctions.h", 
		"MsgQueue.cpp", "MsgQueue.h", "PortVariable.cpp", "PortVariable.h",
		"Requirement.cpp", "Requirement.h", "VariablesHandler.h", "VerificationFSM.cpp", 
		"VerificationFSM.h", "Verifier.h", "Verifier.cpp", "make_dll.bat")
} 