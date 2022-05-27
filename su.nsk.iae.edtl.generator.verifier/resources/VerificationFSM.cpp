#include "VerificationFSM.h"

VerificationFSM::VerificationFSM(int id, uint8_t req_id) : id(id), req_id(req_id)
{
    setState(CHECK_TRIGGER);
};

void VerificationFSM::set(EdtlAttributes edtlAttributes)
{
    this->edtlAttributes.trigger = edtlAttributes.trigger;
    this->edtlAttributes.release = edtlAttributes.release;
    this->edtlAttributes.final = edtlAttributes.final;
    this->edtlAttributes.delay = edtlAttributes.delay;
    this->edtlAttributes.invariant = edtlAttributes.invariant;
    this->edtlAttributes.reaction = edtlAttributes.reaction;
};

void VerificationFSM::checkTrigger()
{
    if (!edtlAttributes.trigger)
        return;
    setState(CHECK_FINAL);
    checkFinal();
};

void VerificationFSM::checkFinal()
{
    if (edtlAttributes.release)
        return setState(SUCCESS);
    if (!edtlAttributes.invariant)
        return setState(FAIL);
    if (!edtlAttributes.final)
        return;
    setState(CHECK_REACTION);
    checkReaction();
};

void VerificationFSM::checkReaction()
{
    if (edtlAttributes.release)
        return setState(SUCCESS);
    if (!edtlAttributes.invariant)
        return setState(FAIL);
    if (edtlAttributes.reaction)
        return setState(SUCCESS);
    if (edtlAttributes.delay)
        return setState(FAIL);
};

void VerificationFSM::setState(state newState)
{
    if (newState == SUCCESS || newState == FAIL) SendMsgGUICode(newState + req_id * 2);
    this->time = (clock() - programTimeStart)/(CLOCKS_PER_SEC/1000);
    this->curState = newState;
};

long VerificationFSM::getTime()
{
    return time;
}

void VerificationFSM::verify()
{
    switch (curState)
    {
        case CHECK_TRIGGER:
            return checkTrigger();
        case CHECK_FINAL:
            return checkFinal();
        case CHECK_REACTION:
            return checkReaction();
        default:
            return;
    }
};

bool VerificationFSM::isCheckTrigger()
{
    return curState == CHECK_TRIGGER;
};

bool VerificationFSM::isActive()
{
    return curState == CHECK_TRIGGER || curState == CHECK_FINAL || curState == CHECK_REACTION;
};

bool VerificationFSM::isPassive()
{
    return curState == FAIL || curState == SUCCESS;
};

void VerificationFSM::logCurState(std::ofstream& fout) {
	if(!fout) return;
    fout << (int)req_id << ",";
    fout << id << ",";
    switch(curState){
        case CHECK_TRIGGER: {
            fout << "TRIGGER" << ",";
            break;
        }
        case CHECK_FINAL: { 
            fout << "FINAL" << ",";
            break;
        }
        case CHECK_REACTION: {
            fout << "REACTION" << ",";
            break;
        }
        case SUCCESS: {
            fout << "SUCCESS" << ",";
            break;
        }
        default: {
            fout << "FAIL" << ",";
            break;
        }
    }
    fout << getTime()
        << "," << edtlAttributes.trigger
        << "," << edtlAttributes.release
        << "," << edtlAttributes.final
        << "," << edtlAttributes.delay
        << "," << edtlAttributes.invariant
        << "," << edtlAttributes.reaction
        << "," << (currentTime - programTimeStart)/(CLOCKS_PER_SEC/1000) << std::endl;
};
