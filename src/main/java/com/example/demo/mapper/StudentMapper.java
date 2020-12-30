package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    Student seeDetail(String Id);

    void editDetail(String Id);
    void applyLeave();
}
