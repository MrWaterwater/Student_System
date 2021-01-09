package com.example.demo.mapper;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper {
    Student seeDetail(String Id);
    int editDetail(Student student);
    int applyLeave(Leave_record record);
    int updateInformation(String Id);
}
