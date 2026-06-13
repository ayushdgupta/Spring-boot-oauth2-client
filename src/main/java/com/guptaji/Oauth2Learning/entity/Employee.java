package com.guptaji.Oauth2Learning.entity;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private Long empId;
    private String orgName;

    public Employee() {
        // default constructor
    }

    public Employee(String name, Long empId, String orgName) {
        this.name = name;
        this.empId = empId;
        this.orgName = orgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
