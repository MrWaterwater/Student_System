package com.example.demo.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Leave_record {
    private String student_id;
    private Date leave_time;
    private String reason;

    public String getstudent_Id() {
        return student_id;
    }

    public void setstudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Date getleave_time() {
        return leave_time;
    }

    public void setleave_time(Date leave_time) {
        this.leave_time = leave_time;
    }

    public String getreason() {
        return reason;
    }

    public void setreason(String reason) {
        this.reason = reason;
    }
}
