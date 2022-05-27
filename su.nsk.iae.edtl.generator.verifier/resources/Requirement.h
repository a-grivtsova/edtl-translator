#include <ctime>
#include <string>
#include "constants.h"
#include "VerificationFSM.h"
#include "EdtlFunctions.h"
#include <vector>
#include <algorithm>
#include <fstream>

#ifndef REQUIREMENT_H
#define REQUIREMENT_H 1

#pragma pack (1)
struct St_Word
{
    uint32_t maxTime;  /*наибольшее время из автоматов для текущего требования*/
    uint8_t numFSMs;     /* кол-во верифицирующих автоматов для требования */
};

extern St_Word *Pr_States;

class Requirement {
    private:
        uint8_t reqId;
        int maxId = 0;
        std::vector<VerificationFSM*> fsms;

    public:
        Requirement(uint8_t reqId);
        ~Requirement();
        void checkVerificationFSMs();
        void run();
        void refreshAttributes(std::map <std::string, PortVariable*>&);
        void Requirement::logRequirement(std::ofstream&);
};
 
#endif
