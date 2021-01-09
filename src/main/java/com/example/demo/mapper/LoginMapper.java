package com.example.demo.mapper;

import com.example.demo.pojo.Login;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    List<Login> login();
    Login alogin();
    void editLogin(Login login);
    void add(Login login);
}
