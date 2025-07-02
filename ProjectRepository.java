package com.employee.employeemanagement.repository;

import com.employee.employeemanagement.service.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
