package com.storemanagement.agentservice.service;

import com.storemanagement.agentservice.entity.Agent;

import java.util.HashMap;

public interface AgentAccountService {

    /*
    getAgentProfile() method is to
    return to agent basic details
    */
    public HashMap<Object,Object> getAgentProfile(String agentId);

    Agent getAgentDetails(String agentId);
}
