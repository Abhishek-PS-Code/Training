package com.storemanagement.agentservice.controller;

import com.storemanagement.agentservice.entity.Agent;
import com.storemanagement.agentservice.service.AgentSearchService;

import java.util.List;

public class AgentSearchController {

    private AgentSearchService agentSearchService;

    public List<Agent> getAgentByEmail(String email){

        List<Agent> agents = agentSearchService.getAgentByEmail(email);
        return agents;

    }

    public List<Agent> getAgentByStoreId(String storeId){

        List<Agent> agents = agentSearchService.getAgentByStoreId(storeId);
        return agents;
    }
}
