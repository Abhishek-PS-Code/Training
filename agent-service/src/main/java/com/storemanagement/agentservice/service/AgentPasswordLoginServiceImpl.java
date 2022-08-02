package com.storemanagement.agentservice.service;

import com.storemanagement.agentservice.dao.AuthenticationDAO;
import com.storemanagement.agentservice.dao.AuthenticationDAOImpl;
import com.storemanagement.agentservice.error.EmptyFieldException;

public class AgentPasswordLoginServiceImpl implements AgentPasswordLoginService{

    private AuthenticationDAO authenticationDAO;
    @Override
    public boolean passwordAgentLogin(String loginId, String password) throws EmptyFieldException {

        if(loginId==null || loginId=="")
        {
            throw new EmptyFieldException("Log-In or Password Can not be empty...!!");
        }else{

            authenticationDAO = new AuthenticationDAOImpl();
            return authenticationDAO.passwordAgentLogin(loginId,password);
            }
        }
    }
