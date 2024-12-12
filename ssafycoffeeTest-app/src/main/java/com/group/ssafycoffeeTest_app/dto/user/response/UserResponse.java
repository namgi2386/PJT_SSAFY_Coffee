package com.group.ssafycoffeeTest_app.dto.user.response;

public class UserResponse {

    private String account;
    private String name;

    // 생성자, getter, setter
    public UserResponse(String account, String name) {
        this.account = account;
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
}
