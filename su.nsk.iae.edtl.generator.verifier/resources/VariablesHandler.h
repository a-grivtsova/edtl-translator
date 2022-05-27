#include "PortVariable.h"
#include <map>
#include <string>

#ifndef VARIABLES_HANDLER_H
#define VARIABLES_HANDLER_H 1

extern int8_t* aInput;
extern int8_t* aOutput;

void setVariables(std::map <std::string, PortVariable*>&);
#endif