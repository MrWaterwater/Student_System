package com.example.demo.service.impl;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.pojo.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public List<Login> login() {
        return loginMapper.login();
    }

    @Override
    public void editLogin(Login login) {
        loginMapper.editLogin(login);
    }

    @Override
    public void add(Login login) {
        loginMapper.add(login);
    }
}
