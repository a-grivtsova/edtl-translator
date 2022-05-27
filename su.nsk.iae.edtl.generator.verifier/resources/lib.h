#pragma once
#include "LabVIEWData.h"
#include "MsgQueue.h"
#include "constants.h"
#include <inttypes.h>

MgErr _msg_array_resize(ArrayOfMessagesHdl _msgs);
MgErr _states_array_resize(ArrayOfStatesHdl states_hdl);

void parse_input_msg_array(ArrayOfMessagesHdl input_LV_queue, MsgQueue & result_queue);

void parse_output_msg_array(MsgQueue & output_queue, ArrayOfMessagesHdl output_LV_queue); 
