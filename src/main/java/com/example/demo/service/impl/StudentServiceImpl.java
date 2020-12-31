package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Leave_record;
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
        return studentMapper.seeDetail(Id);
    }

    @Override
    public void editDetail(Student student) {
        studentMapper.editDetail(student);
    }

    @Override
    public void applyLeave(Leave_record record) {
        studentMapper.applyLeave(record);
    }

    @Override
    public void updateInformation(String Id) {
        studentMapper.updateInformation(Id);
    }
}
