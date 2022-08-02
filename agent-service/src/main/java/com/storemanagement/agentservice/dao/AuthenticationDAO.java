package com.storemanagement.agentservice.dao;

public interface AuthenticationDAO {

    public boolean passwordAgentLogin(String loginId, String password);
}
