#include "InterfaceDll.h"
#include "lib.h"
#include "MsgQueue.h"
#include "MsgFunctions.h"
#include "EdtlFunctions.h"
#include "Verifier.h"

PortsHdl algInputPorts = nullptr;
PortsHdl algOutputPorts = nullptr;

St_Word *Pr_States = nullptr;
int8_t* aInput = nullptr;
int8_t* aOutput = nullptr;

Verifier* verifier = nullptr;

clock_t programTimeStart = 0;
clock_t currentTime = 0;

MgErr set_input_msg_from_CA(ArrayOfMessagesHdl input_msgs)
{
	return _msg_array_resize(input_msgs);
}
MgErr set_input_msg_from_SC(ArrayOfMessagesHdl input_msgs)
{
	return _msg_array_resize(input_msgs);
}

MgErr set_output_msg(ArrayOfMessagesHdl output_msgs)
{
	return _msg_array_resize(output_msgs);
}
MgErr set_output_msg_to_SC(ArrayOfMessagesHdl output_msgs)
{
	return _msg_array_resize(output_msgs);
}

extern "C" __declspec(dllexport) void LLD(
	PortsHdl algInputPorts,	 // algInputPorts
	PortsHdl algOutputPorts, // algOutputPorts

	/*INPUT MSGS*/
	ArrayOfMessagesHdl scenarios2VerifierOutputMsgs, // scenarios2VerifierOutputMsgs
	ArrayOfMessagesHdl algOutputMsgs,				 // algOutputMsgs

	/*OUTPUT MSGS*/
	ArrayOfMessagesHdl verifier2GUIOutputMsgs,			  // verifier2GUIOutputMsgs
	ArrayOfMessagesHdl verifier2scenariousControlOutMsgs, // verifier2scenariousControlOutMsgs
	ArrayOfStatesHdl states)
{
	static int32_t counter = 0;
	if (0 == counter)
	{
		if ((*algInputPorts)->dimSize != INPUT_PORTS_COUNTER || (*algOutputPorts)->dimSize != OUTPUT_PORTS_COUNTER)
		{
			return;
		}
		counter = 1;
		programTimeStart = clock();
		currentTime = programTimeStart;
		Pr_States = new St_Word[REQUIREMENT_COUNTER];
		aInput = new int8_t[INPUT_PORTS_COUNTER];
		aOutput = new int8_t[INPUT_PORTS_COUNTER];
		ConstructMsgQueue(&MainGUIOutputQueue);
		ConstructMsgQueue(&SCMOutputQueue);
		ConstructMsgQueue(&CAInputQueue);
		ConstructMsgQueue(&SCMInputQueue);

		set_output_msg(verifier2GUIOutputMsgs);
		set_output_msg_to_SC(verifier2scenariousControlOutMsgs);

		_states_array_resize(states);
		SendMsgSCMCode(0);
		verifier = new Verifier();
	}

	currentTime = clock();

	for (size_t i = 0; i < (*algInputPorts)->dimSize; i++)
	{
		aInput[i] = (int8_t)(*algInputPorts)->ports[i];
	}
	for (size_t i = 0; i < (*algOutputPorts)->dimSize; i++)
	{
		aOutput[i] = (int8_t)(*algOutputPorts)->ports[i];
	}

	parse_input_msg_array(algOutputMsgs, CAInputQueue);
	parse_input_msg_array(scenarios2VerifierOutputMsgs, SCMInputQueue);

	verifier->run();

	parse_output_msg_array(MainGUIOutputQueue, verifier2GUIOutputMsgs);
	parse_output_msg_array(SCMOutputQueue, verifier2scenariousControlOutMsgs);

	for (int k = 0; k < (*states)->dimSize && k < REQUIREMENT_COUNTER; k++)
	{
		(*states)->state[k].cur_state = Pr_States[k].numFSMs;
		(*states)->state[k].TimeInState = Pr_States[k].maxTime;
	}
}

