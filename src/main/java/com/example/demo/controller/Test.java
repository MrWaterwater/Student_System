package com.example.demo.controller;

import com.example.demo.mapper.LoginMapper;
import com.example.demo.pojo.Login;
import com.example.demo.pojo.Student;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    AdministratorServiceImpl administratorService;
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping("/login")
    public String test(){
        Login login = loginService.login("admin");
        String n = "admin";
        String p = "123abc";
        if(n.equals(login.getLoginId())&&p.equals(login.getPassword())){
           return "succeed" ;
        }
    return "failed"+login.getLoginId()+login.getPassword();
    }
}
