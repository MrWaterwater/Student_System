package com.example.demo.service;

import com.example.demo.pojo.Login;

import java.util.List;

public interface LoginService {
    List<Login> login();
    Login alogin();
    int slogin(Login login);
    void editLogin(Login login);
    void add(Login login);
}
