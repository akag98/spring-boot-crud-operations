package com.lowes.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lowes.assessment.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
