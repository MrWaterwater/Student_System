package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@ApiModel("离开记录实体")
public class Leave_record {
    @ApiModelProperty("学生Id")
    private String student_id;
    @ApiModelProperty("离开时间")
    private Date leave_time;
    @ApiModelProperty("离开理由")
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
