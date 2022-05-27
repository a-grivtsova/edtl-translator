#include "lib.h"
typedef int64_t __int64;	

MgErr _states_array_resize(ArrayOfStatesHdl states_hdl)
{
	MgErr error;
	if (mgNoErr == (error = DSSetHSzClr(states_hdl, Offset(ArrayOfStates, state) + sizeof(ProcessState) * REQUIREMENT_COUNTER)))
	{
		(*states_hdl)->dimSize = REQUIREMENT_COUNTER;
	}
	return error;
}

MgErr _msg_array_resize(ArrayOfMessagesHdl _msgs)
{
	int32_t new_size = ARRLENRSMSG;
	MgErr err;
	if (mgNoErr == (err = DSSetHSzClr(_msgs, Offset(ArrayOfMessages, message) + new_size * sizeof(MessageCluster))))
	{
		for (size_t i = 0; i < new_size; i++)
		{
			MessageCluster * msg = &(*_msgs)->message[i];
			msg->msg = -1;
			msg->type = 0;
			msg->param = 0;
		}
		(*_msgs)->dimSize = new_size;
	}
	return err;
}

void parse_output_msg_array(MsgQueue & output_queue, ArrayOfMessagesHdl outputMsgArray)
{
	for (int32_t i = 0; i < (*outputMsgArray)->dimSize; i++)
	{
		if (true != isEmptyMsgQueue(&output_queue))
		{
			QueueMsg msg;
			GetHeadMsgQueue(&output_queue, &msg);
			(*outputMsgArray)->message[i].msg = msg.code;
			(*outputMsgArray)->message[i].param = msg.param.pr_long;
			(*outputMsgArray)->message[i].type = msg.type;
		}
		else
		{
			(*outputMsgArray)->message[i].msg = -1;
			(*outputMsgArray)->message[i].param = 0;
			(*outputMsgArray)->message[i].type = 0;
		}
	}

}

void parse_input_msg_array(ArrayOfMessagesHdl input_LV_queue, MsgQueue & result_queue)
{
	//inputMsgArray
	MessageCluster * iter = (*input_LV_queue)->message;

	for (int i = 0; i < (*input_LV_queue)->dimSize; i++)
	{
		if (-1 == iter[i].msg)
			return;

		switch (iter[i].type)
		{
		case EMPTY_MSG:
			PutTailMsgQueue(&result_queue, iter[i].msg);
			break;
		case BYTE_TYPE:
			PutTailMsgQueueB(&result_queue, iter[i].msg, static_cast<char> (iter[i].param));
			break;
		case  INT_TYPE:
			PutTailMsgQueueI(&result_queue, iter[i].msg, iter[i].param);
			break;
		case FLOAT_TYPE:
			PutTailMsgQueueF(&result_queue, iter[i].msg, *(float32 *)(&(iter[i].param)));
			break;
		default:
			break;
		}
	}
}
