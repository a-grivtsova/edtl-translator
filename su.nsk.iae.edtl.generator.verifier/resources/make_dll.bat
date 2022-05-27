chcp 65001>NUL
set cintools="C:\Program Files (x86)\National Instruments\LabVIEW 2020\cintools"

echo Build algoblock...
mingw32-g++ -c -w -DBUILDING_EXAMPLE_DLL Logger.cpp MsgQueue.cpp MsgFunctions.cpp InterfaceDll.cpp lib.cpp EdtlFunctions.cpp PortVariable.cpp Requirement.cpp VariablesHandler.cpp VerificationFSM.cpp Verifier.cpp -I%cintools% -m32 -L%cintools% -llabviewv -fpermissive

echo Build algoblock...
mingw32-g++ -w -shared -o VM.dll Logger.o MsgQueue.o MsgFunctions.o InterfaceDll.o lib.o EdtlFunctions.o PortVariable.o Requirement.o VariablesHandler.o VerificationFSM.o Verifier.o -m32 -Wl,--subsystem,windows,--output-def,add.def,--out-implib,libadd.a -L%cintools% -llabviewv -static-libstdc++ -static-libgcc

echo d | XCOPY /f /y VM.dll %1\VM
echo d | XCOPY /f /y VMports.h %1\VM\src
echo d | XCOPY /f /y ".\cfg\*.*" "%1\VM\cfg\*.*"

echo Finished