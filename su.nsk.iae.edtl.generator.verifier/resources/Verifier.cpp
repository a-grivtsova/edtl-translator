#include "Verifier.h"

Verifier::Verifier()
{
    for (int i = 0; i < REQUIREMENT_COUNTER; ++i)
        requirements.push_back(new Requirement(i));
    setVariables(variables);
    setFileName(variables);
};

Verifier::~Verifier()
{
    for (auto requirement : requirements)
    {
        delete requirement;
    }
    requirements.clear();
    variables.clear();
};

void Verifier::read()
{
    for (auto pair : variables)
        pair.second->read();
}

void Verifier::run()
{
    if (GetNextMsgFromSCM())
    {
        int SCMsgCode = GetMsgCodeFromSCM();
        if (SCMsgCode == 0)
        {
            stop = 1;
            SendMsgGUICode(0);
        }
    }

    if (stop)
        return;

    read();
    for (auto requirement : requirements)
    {
        requirement->checkVerificationFSMs();
        requirement->refreshAttributes(variables);
        requirement->run();
        logReq(*requirement);
    }
    logVars(variables);
};
