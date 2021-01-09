package com.example.demo.service;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;

import java.util.List;

public interface AdministratorService {
    void addStudent(Student student);
    void addInformation(String Id);

    void deleteStudent(String Id);
    void deleteLogin(String Id);
    void deleteRecord(String Id);
    void deleteInformation(String Id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    List<Leave_record> selectAllLeaves();
}
