package com.example.demo.mapper;

import com.example.demo.pojo.Leave_record;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdministratorMapper {
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
