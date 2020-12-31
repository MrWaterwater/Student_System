package com.example.demo.controller;

import com.example.demo.pojo.Information;
import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Login;
import com.example.demo.pojo.Student;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministratorController {
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
    private Information information;
    @RequestMapping("/delete")
    public String delete(){
        administratorService.deleteRecord("stu4");
        administratorService.deleteLogin("stu4");
        administratorService.deleteInformation("stu4");
        administratorService.deleteStudent("stu4");
        return "succeed";
    }
    @RequestMapping("/add")
    public String add(){
//        student.setId("stu4");
//        student.setName("学生4");
//        student.setBatch("大数据4班");
//        student.setage(19);
//        student.setDOB("无");
//        student.setEmail("asdlfkj@qq.com");
//        student.setBlood_group("O");
//        student.setContact_number("132141234");
//        student.setAddress("海南");
//        login.setlogin_id("stu4");
//        login.setpassword("ceshipwd");
        information.setStudent_id("stu4");
        information.setLeave_taken(0);
        information.setLeave_balance(5);
//        administratorService.addStudent(student);
//        loginService.add(login);
        administratorService.addInformation(information.getStudent_id());
        return "succeed";
    }

    @RequestMapping("queryStudent")
    public String queryAllStudent(){
        List<Student> studentList = administratorService.selectAllStudents();
        return studentList.toString();
    }
    @RequestMapping("queryRecord")
    public String queryAllRecord(){
        List<Leave_record> records = administratorService.selectAllLeaves();
        return records.toString();
    }

    @RequestMapping("/update")
    public String update(){
        student.setId("stu4");
        student.setName("学生4");
        student.setBatch("大数据4班");
        student.setage(19);
        student.setDOB("无");
        student.setEmail("asdlfkj@qq.com");
        student.setBlood_group("O");
        student.setContact_number("132141234");
        student.setAddress("海南");
        administratorService.updateStudent(student);
        return "succeed";
    }
}
