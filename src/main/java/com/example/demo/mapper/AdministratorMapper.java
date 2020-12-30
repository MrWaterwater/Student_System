package com.example.demo.mapper;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdministratorMapper {
    void addStudent(Student student);
    void deleteStudent(String Id);
    void updateStudent(String Id);
    List<Student> selectAllStudents();
    List<Leave_record> selectAllLeaves();
}
