package com.employee.employeemanagement.service;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @Column(name = "PID")
    private int pid;

    @Column(name = "ProjectName")  // ✅ Important: explicitly map to DB column
    private String projectName;

    public Project() {}

    public Project(int pid, String projectName) {
        this.pid = pid;
        this.projectName = projectName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
