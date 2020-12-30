package com.example.demo.service.impl;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.pojo.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public Login login(String Id) {
        return loginMapper.login(Id);
    }
}
