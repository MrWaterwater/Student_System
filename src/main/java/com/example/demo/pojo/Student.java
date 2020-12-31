package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String student_id;
    private String name;
    private String Batch;
    private int age;
    private String dob;
    private String blood_group;
    private String address;
    private String contact_number;
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
}
