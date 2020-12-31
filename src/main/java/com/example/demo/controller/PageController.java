package com.example.demo.controller;

import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {
    @Autowired
    AdministratorServiceImpl administratorService;
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/root")
    public String root(){
        return "root";
    }

    @RequestMapping("/alogin")
    public String alogin(@RequestParam("Id") String Id,@RequestParam("password") String password ){
            if(loginService.login(Id).getpassword().equals(password)){
                return "admin";
            }else {
                return "root";
            }
    }
    @RequestMapping("/slogin")
    public String slogin(@RequestParam("Id") String Id,@RequestParam("password") String password ){
        if(loginService.login(Id).getpassword().equals(password)){
            return "student";
        }else {
            return "root";
        }
    }
}
