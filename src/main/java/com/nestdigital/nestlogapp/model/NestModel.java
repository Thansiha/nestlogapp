package com.nestdigital.nestlogapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class NestModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int empcode;
    private  String designation;
    private  String username;
    private String password;
    private int mobilenum;

    public NestModel() {
    }

    public NestModel(int id, String name, int empcode, String designation, String username, String password, int mobilenum) {
        this.id = id;
        this.name = name;
        this.empcode = empcode;
        this.designation = designation;
        this.username = username;
        this.password = password;
        this.mobilenum = mobilenum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(int mobilenum) {
        this.mobilenum = mobilenum;
    }
}



