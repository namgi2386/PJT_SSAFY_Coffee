package com.group.ssafycoffeeTest_app.domain.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // 테이블이름을 users로 만들었음
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID = null;  // 테이블의 PK와 매핑

    private String account;
    private String password;
    private String name;
    private String MMID;
    private String refund;

    public User(){} //

    public User( String account, String password, String name, String MMID, String refund) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.MMID = MMID;
        this.refund = refund;
    }

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
