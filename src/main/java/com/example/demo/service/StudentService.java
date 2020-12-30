package com.example.demo.service;

import com.example.demo.pojo.Student;

public interface StudentService {
    Student seeDetail(String Id);
    void editDetail(String Id);
    void applyLeave();
}
