package com.example.demo.controller;

import com.example.demo.pojo.Login;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @ApiOperation("管理员登录接口")
    @RequestMapping("/alogin")
    public String alogin(@RequestParam("Id") String Id,@RequestParam("password") String password ){
        List<Login> logins = loginService.login();
        for(Login login:logins){
            if(login.getlogin_id().equals(Id) && login.getpassword().equals(password)){
                return "admin";
            }
        }
        return "root";
    }

    @ApiOperation("学生登录接口")
    @RequestMapping("/slogin")
    public ModelAndView slogin(@RequestParam("Id") String Id, @RequestParam("password") String password ){
        ModelAndView modelAndView = new ModelAndView();
        List<Login> logins = loginService.login();
        for(Login login:logins){
            if(login.getlogin_id().equals(Id) && login.getpassword().equals(password)){
                modelAndView.addObject("ID",login.getlogin_id());
                modelAndView.setViewName("student");
                return modelAndView;
            }
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
