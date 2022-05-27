#include <ctime>
#include <cstdint>
#include "constants.h"
#include "MsgFunctions.h"
#include "EdtlFunctions.h"
#include <fstream>

#ifndef VERIFICATION_FSM_H
#define VERIFICATION_FSM_H 1

struct EdtlAttributes
{
    bool trigger, release, final, delay, invariant, reaction;
};

enum state
{
    SUCCESS = 1,
    FAIL = 2,
    CHECK_TRIGGER = 3,
    CHECK_FINAL = 4,
    CHECK_REACTION = 5
};

class VerificationFSM
{
private:
    int id;
    uint8_t req_id;
    state curState;
    long time;
    EdtlAttributes edtlAttributes;

    void checkTrigger();
    void checkFinal();
    void checkReaction();
    void setState(state);

public:
    VerificationFSM(int, uint8_t);
    void verify();
    bool isCheckTrigger();
    bool isActive();
    bool isPassive();
    void set(EdtlAttributes);
    long getTime();
    void logCurState(std::ofstream&);

};

#endif
