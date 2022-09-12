package com.nestdigital.nestlogapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LeaveRequest")
public class NestLeaveRqstModel {
    @Id
    @GeneratedValue
   private int id;
    private int emp_id;
    private int dateofleaveapply;
    private  int leavedate;
    private int status;

    public NestLeaveRqstModel() {
    }

    public NestLeaveRqstModel(int id, int emp_id, int dateofleaveapply, int leavedate, int status) {
        this.id = id;
        this.emp_id = emp_id;
        this.dateofleaveapply = dateofleaveapply;
        this.leavedate = leavedate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getDateofleaveapply() {
        return dateofleaveapply;
    }

    public void setDateofleaveapply(int dateofleaveapply) {
        this.dateofleaveapply = dateofleaveapply;
    }

    public int getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(int leavedate) {
        this.leavedate = leavedate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
