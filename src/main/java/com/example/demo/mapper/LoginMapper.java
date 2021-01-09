package com.example.demo.mapper;

import com.example.demo.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {
    List<Login> login();
    Login alogin();
    int slogin(Login login);
    int editLogin(Login login);
    int add(Login login);
}
