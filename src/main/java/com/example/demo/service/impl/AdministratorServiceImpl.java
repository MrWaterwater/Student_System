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
    public void addStudent(Student student) {
        administratorMapper.addStudent(student);
    }

    @Override
    public void addInformation(String Id) {
        administratorMapper.addInformation(Id);
    }

    @Override
    public void deleteStudent(String Id) {
        administratorMapper.deleteStudent(Id);
    }

    @Override
    public void updateStudent(Student student) {
        administratorMapper.updateStudent(student);
    }

    @Override
    public void deleteLogin(String Id) {
        administratorMapper.deleteLogin(Id);
    }

    @Override
    public void deleteRecord(String Id) {
        administratorMapper.deleteRecord(Id);
    }

    @Override
    public void deleteInformation(String Id) {
        administratorMapper.deleteInformation(Id);
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
