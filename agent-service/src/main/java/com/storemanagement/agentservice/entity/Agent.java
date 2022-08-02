package com.storemanagement.agentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agent {

    /*
    Agent Id to be unique dynamic alphanumeric value.
    Using JPA.
    */
    private String agentId;
    /*
    loginId also need to be unique and generated using JPA
    */
    private String loginId;
    private String lastName;
    private String firstName;
    private String password;
    private String email;
    private String phone;
    private Date dob;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String pinCode;
    private String defaultStore;
    private Integer defaultPageSize = 10;
    private boolean isActive = true;
    private boolean isAdmin = false;

}
