package com.example.demo.pojo;

import java.util.Date;

public class Leave_record {
    private String sId;
    private Date leave_Date;
    private String Reason;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public Date getLeave_Date() {
        return leave_Date;
    }

    public void setLeave_Date(Date leave_Date) {
        this.leave_Date = leave_Date;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
}
