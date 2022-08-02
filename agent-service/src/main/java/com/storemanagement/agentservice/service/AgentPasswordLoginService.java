package com.storemanagement.agentservice.service;

import com.storemanagement.agentservice.error.EmptyFieldException;

public interface AgentPasswordLoginService {
    public boolean passwordAgentLogin(String loginId, String password) throws EmptyFieldException;
}
