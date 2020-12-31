package com.example.demo.service;

import com.example.demo.pojo.Login;

public interface LoginService {
    Login login(String Id);
    void editLogin(Login login);
    void add(Login login);
}
