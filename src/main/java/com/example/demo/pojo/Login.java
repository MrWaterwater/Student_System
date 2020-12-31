package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Login {
    private String login_id;
    private String password;

    public String getlogin_id() {
        return login_id;
    }

    public void setlogin_id(String loginId) {
        this.login_id = loginId;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
