package com.group.ssafycoffeeTest_app.dto.user.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreateRequest {
    private String account;
    private String password;
    private String name;

    @JsonProperty("MMID")
    private String MMID;

    private String refund;

//    public UserCreateRequest(){}


    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getMMID() {
        return MMID;
    }

    public String getRefund() {
        return refund;
    }

}
