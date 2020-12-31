package com.example.demo.mapper;

import com.example.demo.pojo.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Login login(String Id);
    void editLogin(Login login);
    void add(Login login);
}
