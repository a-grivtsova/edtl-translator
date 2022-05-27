#include "VariablesHandler.h"
#include "Requirement.h"
#include "Logger.h"
#include <vector>

#ifndef VERIFIER_H
#define VERIFIER_H 1

class Verifier
{
    private:
        bool stop = 0;
        std::map<std::string, PortVariable *> variables;
        std::vector<Requirement *> requirements;
        void read();

    public:
        Verifier();
        ~Verifier();
        void run();
};

#endif
