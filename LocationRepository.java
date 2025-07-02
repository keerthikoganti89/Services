package com.employee.employeemanagement.repository;

import com.employee.employeemanagement.service.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
