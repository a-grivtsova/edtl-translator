#ifndef EDTL_FUNCTIONS_HANDLER_H
#define EDTL_FUNCTIONS_HANDLER_H 1

#include "PortVariable.h"
#include "VerificationFSM.h"
#include <map>

extern clock_t programTimeStart;
extern clock_t currentTime;

void calculate(VerificationFSM *, std::map<std::string, PortVariable *> &, uint8_t);

inline bool tau(long start, long time)
{
    long curTime = (clock() - programTimeStart)/(CLOCKS_PER_SEC/1000);
    return curTime < start + time;
};

inline bool fe(PortVariable *v)
{
    return v->prev && !v->cur;
};

inline bool re(PortVariable *v)
{
    return !v->prev && v->cur;
};

inline bool low(PortVariable *v)
{
    return !v->prev && !v->cur;
};

inline bool high(PortVariable *v)
{
    return v->prev && v->cur;
};
#endif