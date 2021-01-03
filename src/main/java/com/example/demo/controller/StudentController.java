package com.example.demo.controller;

import com.example.demo.pojo.Information;
import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Login;
import com.example.demo.pojo.Student;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.util.DateUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    private Student student;
    @Autowired
    private Leave_record record;
    @Autowired
    private Information information;

    @ApiOperation("修改学生信息接口")
    @RequestMapping("/studentUpdate")
    public ModelAndView update(@RequestParam("eId")String ID,@RequestParam("eName")String Name,
                         @RequestParam("eBatch")String Batch,
                         @RequestParam("eAge")int Age,@RequestParam("eDob")String Dob,
                         @RequestParam("eBlood")String Blood,@RequestParam("eAddress")String Address,
                         @RequestParam("eNumber")String Number,@RequestParam("eEmail")String Email){
        ModelAndView modelAndView = new ModelAndView();
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
        modelAndView.addObject("ID",ID);
        modelAndView.setViewName("student");
        return modelAndView;
    }
    @ApiOperation("查看学生详细信息接口")
    @RequestMapping("/detail")
    public ModelAndView detail(@RequestParam("ID")String Id)  {
        ModelAndView modelAndView = new ModelAndView();
        student = studentService.seeDetail(Id);
        modelAndView.addObject("Id",student.getId());
        modelAndView.addObject("Name",student.getName());
        modelAndView.addObject("Batch",student.getBatch());
        modelAndView.addObject("Age",student.getage());
        modelAndView.addObject("Dob",student.getDOB());
        modelAndView.addObject("Blood",student.getBlood_group());
        modelAndView.addObject("Address",student.getAddress());
        modelAndView.addObject("Number",student.getContact_number());
        modelAndView.addObject("Email",student.getEmail());
        modelAndView.setViewName("student");
        return modelAndView;
    }
    @ApiOperation("申请请假接口")
    @RequestMapping("/apply")
    public ModelAndView apply(@RequestParam("AId")String id,@RequestParam("reason")String reason){
        ModelAndView modelAndView = new ModelAndView();
        Date date = new Date();
        record.setleave_time(date);
        record.setstudent_id(id);
        record.setreason(reason);
        information.setStudent_id(id);
        studentService.applyLeave(record);
        studentService.updateInformation(information.getStudent_id());
        modelAndView.addObject("ID",id);
        modelAndView.setViewName("student");
        return modelAndView;
    }

}
