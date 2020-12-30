package com.example.demo.service;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;

import java.util.List;

public interface AdministratorService {
    void addStudent(Student student);
    void deleteStudent(String Id);
    void updateStudent(String Id);
    List<Student> selectAllStudents();
    List<Leave_record> selectAllLeaves();
}
