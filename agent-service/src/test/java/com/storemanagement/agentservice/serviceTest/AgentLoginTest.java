package com.storemanagement.agentservice.serviceTest;

import com.storemanagement.agentservice.dao.AuthenticationDAO;
import com.storemanagement.agentservice.dao.AuthenticationDAOImpl;
import com.storemanagement.agentservice.error.EmptyFieldException;
import com.storemanagement.agentservice.service.AgentPasswordLoginService;
import com.storemanagement.agentservice.service.AgentPasswordLoginServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

public class AgentLoginTest {

    private AgentPasswordLoginService agentPasswordLoginService;
    private AuthenticationDAO authenticationDAO;
    private String loginId;
    private String password;

    private boolean testResult;

    @Before
    public void setUpTest(){
        loginId="abc";
        password="hellotest";
        testResult = false;
        authenticationDAO = Mockito.mock(AuthenticationDAOImpl.class);
        agentPasswordLoginService = new AgentPasswordLoginServiceImpl();

    }

    @Test
    public void passwordLogin() throws EmptyFieldException {
        //when(authenticationDAO.passwordAgentLogin(loginId,password)).then(loginId,password);
        assertEquals(true,agentPasswordLoginService.passwordAgentLogin(loginId,password));
    }
}
