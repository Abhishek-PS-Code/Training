package com.storemanagement.agentservice.controller;

import com.storemanagement.agentservice.entity.Agent;
import com.storemanagement.agentservice.service.AgentAccountService;

import java.util.HashMap;
import java.util.Map;

public class AgentAccountController {

    private AgentAccountService agentAccountService;
    public HashMap<Object, Object> getAgentProfile(String agentId){

        HashMap<Object, Object> agentProfileMap = new HashMap<Object, Object>();
        agentProfileMap = agentAccountService.getAgentProfile(agentId);
        return agentProfileMap;
    }


    public Agent getAgentDetails(String agentId){

        Agent agent = agentAccountService.getAgentDetails(agentId);
        return agent;
    }
}
