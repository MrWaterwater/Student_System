package com.example.demo.controller;

import com.example.demo.pojo.*;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.util.DateUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    private Leave_record record;
    @Autowired
    private Information information;

    @ApiOperation("学生登录接口")
    @PostMapping("/api/login")
    public ResultBean<?> login(@RequestParam("Id") String id, @RequestParam("password") String password ){
        ResultBean<?> result = new ResultBean<>();
        Login l = new Login(id,password);
        if (loginService.slogin(l) > 0){
            result.setCode(ResultBean.SUCCESS);
            return result;
        }
        result.setCode(ResultBean.FAIL);
        result.setMsg("错误的用户名或密码");
        return result;
    }

    @ApiOperation("修改学生信息接口")
    @PostMapping("/api/studentUpdate")
    public ResultBean<?> update(@RequestParam("eId")String ID,@RequestParam("eName")String Name,
                         @RequestParam("eBatch")String Batch,
                         @RequestParam("eAge")int Age,@RequestParam("eDob")String Dob,
                         @RequestParam("eBlood")String Blood,@RequestParam("eAddress")String Address,
                         @RequestParam("eNumber")String Number,@RequestParam("eEmail")String Email){
        ResultBean<?> result = new ResultBean<>();
        student.setId(ID);
        student.setName(Name);
        student.setBatch(Batch);
        student.setage(Age);
        student.setDOB(Dob);
        student.setEmail(Email);
        student.setBlood_group(Blood);
        student.setContact_number(Number);
        student.setAddress(Address);
        administratorService.updateStudent(student);
        result.setCode(ResultBean.SUCCESS);
        return result;
    }
    @ApiOperation("学生详细信息接口")
    @PostMapping("/api/detail")
    public ResultBean<?> detail(@RequestParam("ID")String Id)  {
        ResultBean<Student> result = new ResultBean<>();
        student = studentService.seeDetail(Id);
        result.setData(student);
        return result;
    }
    @ApiOperation("申请请假接口")
    @PostMapping("/api/apply")
    public ResultBean<?> apply(@RequestParam("ID")String id,@RequestParam("reason")String reason){
        ResultBean<?> result = new ResultBean<>();
        Date date = new Date();
        record.setleave_time(date);
        record.setstudent_id(id);
        record.setreason(reason);
        information.setStudent_id(id);
        studentService.applyLeave(record);
        studentService.updateInformation(information.getStudent_id());
        result.setCode(ResultBean.SUCCESS);
        return result;
    }

}
