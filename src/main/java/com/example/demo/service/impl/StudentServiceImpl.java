package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student seeDetail(String Id) {
        return null;
    }

    @Override
    public void editDetail(String Id) {

    }

    @Override
    public void applyLeave() {

    }
}
