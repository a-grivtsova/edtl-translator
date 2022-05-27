#include "Logger.h"

char* reqsFileName = nullptr;
char* varsFileName = nullptr;

void setFileName(std::map <std::string, PortVariable*> &v)
{
    char *path = "C:/Users/Alex/Documents/Logs/";
    char file [100];
 
    time_t rawtime;
    struct tm * timeinfo;
    time(&rawtime);                              
    timeinfo = localtime(&rawtime);
    strftime(file, sizeof(file),"logReqs_%d_%m_%y_%H_%M_%S.csv", timeinfo);
    reqsFileName = new char[  strlen(path) + strlen(file) + 1 ];
    strcpy( reqsFileName, path );
    strcat( reqsFileName, file );
    std::ofstream fReqs(reqsFileName, std::ios_base::app);
    if(!fReqs) return;
    fReqs << "reqId" << "," << "id" << "," << "state" << "," << "stateTime" << "," << "trigger" << "," << "release" << "," << "final" << "," << "delay" << "," << "invariant" << "," << "reaction" << "," << "time" << std::endl;
    
    strftime(file, sizeof(file),"logVars_%d_%m_%y_%H_%M_%S.csv", timeinfo);
    varsFileName = new char[ strlen(path) + strlen(file) + 1 ];
    strcpy( varsFileName, path );
    strcat( varsFileName, file );
    std::ofstream fVars(varsFileName, std::ios_base::app);
    if(!fVars) return;
    fVars << "time";
    for (auto pair : v) {
        fVars
            << "," << pair.first << ".prev"
            << "," << pair.first << ".cur"
            << "," << pair.first << ".post";
    }
    fVars << std::endl;
}

void logReq(Requirement &req){
    std::ofstream fReqs(reqsFileName, std::ios_base::app);
    if(!fReqs) return;
    req.logRequirement(fReqs);
    fReqs.close();
}

void logVars(std::map <std::string, PortVariable*> &v){
    std::ofstream fVars(varsFileName, std::ios_base::app);
    if(!fVars) return;
    fVars << (currentTime - programTimeStart)/(CLOCKS_PER_SEC/1000);
    for (auto pair : v) {
        fVars 
            << "," << (int) pair.second->prev
            << "," << (int) pair.second->cur
            << "," << (int) pair.second->post;
    }
    fVars << std::endl;
    fVars.close();
}