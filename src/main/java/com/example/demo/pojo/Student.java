package com.example.demo.pojo;

public class Student {
    private String Id;
    private String Name;
    private String Password;
    private String Batch;
    private int Age;
    private String DOB;
    private String Blood_Group;
    private String Address;
    private String Contact_Number;
    private String Email;
    private int Leave_taken;
    private int Leave_balance;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        Blood_Group = blood_Group;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        Contact_Number = contact_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getLeave_taken() {
        return Leave_taken;
    }

    public void setLeave_taken(int leave_taken) {
        Leave_taken = leave_taken;
    }

    public int getLeave_balance() {
        return Leave_balance;
    }

    public void setLeave_balance(int leave_balance) {
        Leave_balance = leave_balance;
    }
}
