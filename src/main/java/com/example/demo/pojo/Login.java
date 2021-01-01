package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
@ApiModel("登录实体")
public class Login {
    @ApiModelProperty("登录Id")
    private String login_id;
    @ApiModelProperty("登录密码")
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
