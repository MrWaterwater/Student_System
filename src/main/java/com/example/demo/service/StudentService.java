package com.example.demo.service;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;

public interface StudentService {
    Student seeDetail(String Id);
    void editDetail(Student Student);
    void applyLeave(Leave_record record);
    void updateInformation(String Id);
}
