package com.storemanagement.agentservice.controller;

import com.storemanagement.agentservice.error.EmptyFieldException;
import com.storemanagement.agentservice.service.AgentPasswordLoginService;

public class AgentLoginController {

    private AgentPasswordLoginService agentPasswordLoginService;
    public boolean passwordAgentLogin(String loginId, String password) throws EmptyFieldException {

        return agentPasswordLoginService.passwordAgentLogin(loginId, password);
    }
}
