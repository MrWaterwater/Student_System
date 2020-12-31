package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Information {
    private String student_id;
    private int leave_taken;
    private int leave_balance;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getLeave_taken() {
        return leave_taken;
    }

    public void setLeave_taken(int leave_taken) {
        this.leave_taken = leave_taken;
    }

    public int getLeave_balance() {
        return leave_balance;
    }

    public void setLeave_balance(int leave_balance) {
        this.leave_balance = leave_balance;
    }
}
