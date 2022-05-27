#include "Requirement.h"

Requirement::Requirement(uint8_t id) : reqId(id) {}

Requirement::~Requirement()
{
    for (auto fsm : fsms)
        delete fsm;
    fsms.clear();
}

void Requirement::checkVerificationFSMs()
{
    bool isCheckTrigger = false;
    long minTime = (clock() - programTimeStart)/(CLOCKS_PER_SEC/1000);

    fsms.erase(std::remove_if(fsms.begin(), fsms.end(),
     [](auto& element){return element->isPassive();} ), fsms.end());

    for (auto iter = fsms.begin(); iter != fsms.end(); ++iter)
    {
        isCheckTrigger |= (*iter)->isCheckTrigger();
        if ((*iter)->getTime() < minTime)
            minTime = (*iter)->getTime();
    }

    if (!isCheckTrigger && (fsms.size() < MAX_FSMS))
    {
        fsms.push_back(new VerificationFSM(maxId | (reqId << 16), reqId));
        ++maxId;
    }

    Pr_States[reqId].numFSMs = fsms.size() - 1;
    Pr_States[reqId].maxTime = (clock() - programTimeStart)/(CLOCKS_PER_SEC/1000) - minTime;
}

void Requirement::run()
{
    for (auto fsm : fsms)
    {
        fsm->verify();
    }
}

void Requirement::refreshAttributes(std::map<std::string, PortVariable *> &v)
{
    for (auto fsm : fsms)
    {
        calculate(fsm, v, this->reqId);
    }
}

void Requirement::logRequirement(std::ofstream &fout)
{
    if (!fout)
        return;
    for (auto fsm : fsms)
    {
        fsm->logCurState(fout);
    }
}
