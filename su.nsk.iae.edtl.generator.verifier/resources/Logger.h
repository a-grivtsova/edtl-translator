#include "Requirement.h"
#include "VariablesHandler.h"
#include "EdtlFunctions.h"
#include <fstream>
#include <cstring>

#ifndef LOGGER_H
#define LOGGER_H

extern char* fileName;

void setFileName(std::map <std::string, PortVariable*> &);
void logReq(Requirement&);
void logVars(std::map <std::string, PortVariable*>&);

#endif