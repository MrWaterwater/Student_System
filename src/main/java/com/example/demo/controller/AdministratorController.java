package com.example.demo.controller;

import com.example.demo.pojo.*;
import com.example.demo.service.impl.AdministratorServiceImpl;
import com.example.demo.service.impl.LoginServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class AdministratorController {
    @Autowired
    private AdministratorServiceImpl administratorService;
    @Autowired
    private LoginServiceImpl loginService;
    @Autowired
    private Student student;
    @Autowired
    private Login login;
    @Autowired
    private Information information;

    @ApiOperation("管理员登录接口")
    @PostMapping("/api/alogin")
    public ResultBean<?> alogin(@RequestParam("Id") String id,@RequestParam("password") String password ){
        ResultBean<?> result = new ResultBean<>();
        Login al = loginService.alogin();
        if (al.getlogin_id().equals(id) && al.getpassword().equals(password)){
            result.setCode(ResultBean.SUCCESS);
            return result;
        }
        result.setCode(ResultBean.FAIL);
        result.setMsg("错误的用户名或密码");
        return result;
    }

    @ApiOperation("删除学生接口")
    @PostMapping("/api/delete")
    public ResultBean<?> delete(@RequestParam("dID")String Id){
        ResultBean<?> result = new ResultBean<>();
        administratorService.deleteRecord(Id);
        administratorService.deleteLogin(Id);
        administratorService.deleteInformation(Id);
        administratorService.deleteStudent(Id);
        result.setCode(ResultBean.SUCCESS);
        return result;
    }

    @ApiOperation("新增学生接口")
    @PostMapping("/api/add")
    public ResultBean<?> add(@RequestParam("aId")String Id,@RequestParam("aName")String Name,
                    @RequestParam("apassword")String Password,@RequestParam("aBatch")String Batch,
                    @RequestParam("aAge")int Age,@RequestParam("aDob")String Dob,
                    @RequestParam("aBlood")String Blood,@RequestParam("aAddress")String Address,
                    @RequestParam("aNumber")String Number,@RequestParam("aEmail")String Email){
        ResultBean<?> result = new ResultBean<>();
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
        result.setCode(ResultBean.SUCCESS);
        return result;
    }

    @ApiOperation("查询学生所有接口")
    @PostMapping("/api/queryAllStudent")
    public ResultBean<?> queryAllStudent(){
        ResultBean<List<Student>> result = new ResultBean<>();
        List<Student> studentList = administratorService.selectAllStudents();
        result.setCode(ResultBean.SUCCESS);
        result.setData(studentList);
        return result;
    }

    @ApiOperation("查询请假记录接口")
    @PostMapping("/api/queryAllRecord")
    public ResultBean<?> queryAllRecord(){
        ResultBean<List<?>> result = new ResultBean<>();
        List<Leave_record> records = administratorService.selectAllLeaves();
        result.setCode(ResultBean.SUCCESS);
        result.setData(records);
        return result;
    }

    @ApiOperation("修改学生信息接口")
    @PostMapping("/api/update")
    public ResultBean<?> update(@RequestParam("eId")String ID,@RequestParam("eName")String Name,
                         @RequestParam("eBatch")String Batch,
                         @RequestParam("eAge")int Age,@RequestParam("eDob")String Dob,
                         @RequestParam("eBlood")String Blood,@RequestParam("eAddress")String Address,
                         @RequestParam("eNumber")String Number,@RequestParam("eEmail")String Email){
        ResultBean<?> result = new  ResultBean<>();
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
        result.setCode(ResultBean.SUCCESS);
        return result;
    }
}
