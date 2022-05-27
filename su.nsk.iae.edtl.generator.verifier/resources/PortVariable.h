#include "constants.h"
#include <cstdint>

#ifndef PORT_VARIABLE_H
#define PORT_VARIABLE_H 1

class PortVariable
{
    private:
        uint8_t signalType;
        int8_t *port;
        uint8_t bit;
    public:
        PortVariable(int8_t*, uint8_t, uint8_t);
        uint8_t prev;
        uint8_t cur;
        uint8_t post;
        void read(); 
};
 
#endif
