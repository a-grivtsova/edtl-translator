#include "PortVariable.h"

PortVariable::PortVariable(int8_t *port, uint8_t signalType, uint8_t bit) : signalType(signalType), bit(bit), port(port), prev(0), cur(0), post(0){};

void PortVariable::read()
{
    uint8_t value;
    if (bit < 8)
        value = (*port & (1 << bit)) >> bit;
    else
        value = *port;
    prev = cur;
    cur = (signalType == 0) ? value : post;
    post = value;
};
