package com.example.demo.service;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;

import java.util.List;

public interface AdministratorService {
    int addStudent(Student student);
    int addInformation(String Id);
    int deleteStudent(String Id);
    int deleteLogin(String Id);
    int deleteRecord(String Id);
    int deleteInformation(String Id);
    int updateStudent(Student student);

    List<Student> selectAllStudents();

    List<Leave_record> selectAllLeaves();
}
