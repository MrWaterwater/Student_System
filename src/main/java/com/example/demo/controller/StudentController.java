package com.example.demo.controller;

import com.example.demo.pojo.Information;
import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Login;
import com.example.demo.pojo.Student;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StudentController {
    @Autowired
    private AdministratorServiceImpl administratorService;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private LoginServiceImpl loginService;

    @Autowired
    private Student student;
    @Autowired
    private Login login;
    @Autowired
    private Leave_record record;
    @Autowired
    private Information information;

    @ApiOperation("修改学生信息接口")
    @RequestMapping("/studentUpdate")
    public String update(){
        student.setId("stu4");
        student.setName("学生4");
        student.setBatch("大数据4班");
        student.setage(19);
        student.setDOB("修改测试");
        student.setEmail("asdlfkj@qq.com");
        student.setBlood_group("O");
        student.setContact_number("132141234");
        student.setAddress("海南");
        login.setlogin_id("stu4");
        login.setpassword("ceshi");
        administratorService.updateStudent(student);
        loginService.editLogin(login);
        return "succeed";
    }
    @ApiOperation("查看学生详细信息接口")
    @RequestMapping("/detail")
    public String detail(){
        student = studentService.seeDetail("stu4");
        return student.toString();
    }
    @ApiOperation("申请请假接口")
    @RequestMapping("/apply")
    public String apply(){
        Date date = new Date();
        record.setstudent_id("stu1");
        record.setreason("ababceshi");
        record.setleave_time(date);
        information.setStudent_id("stu1");
        studentService.applyLeave(record);
        studentService.updateInformation(information.getStudent_id());
        return "succeed";
    }
}
