package com.example.demo.service.impl;

import com.example.demo.mapper.AdministratorMapper;
import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;
import com.example.demo.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;
    @Override
    public int addStudent(Student student) {
        return administratorMapper.addStudent(student);
    }

    @Override
    public int addInformation(String Id) {
        return administratorMapper.addInformation(Id);
    }

    @Override
    public int deleteStudent(String Id) {
        return administratorMapper.deleteStudent(Id);
    }

    @Override
    public int updateStudent(Student student) {
        return administratorMapper.updateStudent(student);
    }

    @Override
    public int deleteLogin(String Id) {
        return administratorMapper.deleteLogin(Id);
    }

    @Override
    public int deleteRecord(String Id) {
        return administratorMapper.deleteRecord(Id);
    }

    @Override
    public int deleteInformation(String Id) {
        return administratorMapper.deleteInformation(Id);
    }

    @Override
    public List<Student> selectAllStudents() {
        return administratorMapper.selectAllStudents();
    }

    @Override
    public List<Leave_record> selectAllLeaves() {
        return administratorMapper.selectAllLeaves();
    }


}
