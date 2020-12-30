package com.example.demo.mapper;

import com.example.demo.pojo.Student;

public interface StudentMapper {
    Student seeDetail(String Id);
    void editDetail(String Id);
    void applyLeave();
}
