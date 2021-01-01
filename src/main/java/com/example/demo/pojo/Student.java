package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
@ApiModel("学生实体")
public class Student {
    @ApiModelProperty("学生Id")
    private String student_id;
    @ApiModelProperty("学生姓名")
    private String name;
    @ApiModelProperty("学生班级")
    private String Batch;
    @ApiModelProperty("学生年龄")
    private int age;
    @ApiModelProperty("学生DOB")
    private String dob;
    @ApiModelProperty("学生血型")
    private String blood_group;
    @ApiModelProperty("学生地址")
    private String address;
    @ApiModelProperty("学生电话")
    private String contact_number;
    @ApiModelProperty("学生Email")
    private String email;

    public String getId() {
        return student_id;
    }

    public void setId(String id) {
        student_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getDOB() {
        return dob;
    }

    public void setDOB(String DOB) {
        this.dob = DOB;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id='" + student_id + '\'' +
                ", name='" + name + '\'' +
                ", Batch='" + Batch + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", blood_group='" + blood_group + '\'' +
                ", address='" + address + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
