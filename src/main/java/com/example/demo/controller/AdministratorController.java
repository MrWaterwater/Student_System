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
import org.springframework.web.bind.annotation.RequestParam;
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

    @ApiOperation("删除学生接口")
    @RequestMapping("/delete")
    public void delete(@RequestParam("dID")String Id){
        administratorService.deleteRecord(Id);
        administratorService.deleteLogin(Id);
        administratorService.deleteInformation(Id);
        administratorService.deleteStudent(Id);
    }

    @ApiOperation("新增学生接口")
    @RequestMapping("/add")
    public String add(@RequestParam("aId")String Id,@RequestParam("aName")String Name,
                    @RequestParam("apassword")String Password,@RequestParam("aBatch")String Batch,
                    @RequestParam("aAge")int Age,@RequestParam("aDob")String Dob,
                    @RequestParam("aBlood")String Blood,@RequestParam("aAddress")String Address,
                    @RequestParam("aNumber")String Number,@RequestParam("aEmail")String Email){
        student.setId(Id);
        student.setName(Name);
        student.setBatch(Batch);
        student.setage(Age);
        student.setDOB(Dob);
        student.setEmail(Email);
        student.setBlood_group(Blood);
        student.setContact_number(Number);
        student.setAddress(Address);
        login.setlogin_id(Id);
        login.setpassword(Password);
        information.setStudent_id(Id);
        information.setLeave_taken(0);
        information.setLeave_balance(5);
        administratorService.addStudent(student);
        loginService.add(login);
        administratorService.addInformation(information.getStudent_id());
        return "Aedit";
    }

    @ApiOperation("查询学生所有接口")
    @RequestMapping("queryStudent")
    public List<Student> queryAllStudent(){
        List<Student> studentList = administratorService.selectAllStudents();
        return studentList;
    }

    @ApiOperation("查询请假记录接口")
    @RequestMapping("queryRecord")
    public List<Leave_record> queryAllRecord(){
        List<Leave_record> records = administratorService.selectAllLeaves();
        return records;
    }

    @ApiOperation("修改学生信息接口")
    @RequestMapping("/update")
    public String update(@RequestParam("eId")String ID,@RequestParam("eName")String Name,
                         @RequestParam("eBatch")String Batch,
                         @RequestParam("eAge")int Age,@RequestParam("eDob")String Dob,
                         @RequestParam("eBlood")String Blood,@RequestParam("eAddress")String Address,
                         @RequestParam("eNumber")String Number,@RequestParam("eEmail")String Email){
        student.setId(ID);
        student.setName(Name);
        student.setBatch(Batch);
        student.setage(Age);
        student.setDOB(Dob);
        student.setEmail(Email);
        student.setBlood_group(Blood);
        student.setContact_number(Number);
        student.setAddress(Address);
        login.setlogin_id(ID);
        administratorService.updateStudent(student);
        return "Aedit";
    }
}
