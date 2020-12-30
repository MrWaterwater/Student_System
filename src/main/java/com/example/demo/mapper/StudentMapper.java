package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper {
    Student seeDetail(String Id);
    void editDetail(String Id);
    void applyLeave();
}
