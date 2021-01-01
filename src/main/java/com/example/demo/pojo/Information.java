package com.example.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
@ApiModel("学生请假次数信息实体")
public class Information {
    @ApiModelProperty("学生Id")
    private String student_id;
    @ApiModelProperty("请假次数")
    private int leave_taken;
    @ApiModelProperty("剩余次数")
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
