package com.storemanagement.agentservice.service;

import com.storemanagement.agentservice.entity.Agent;

import java.util.List;

public interface AgentSearchService {
    List<Agent> getAgentByEmail(String email);

    List<Agent> getAgentByStoreId(String storeId);
}
