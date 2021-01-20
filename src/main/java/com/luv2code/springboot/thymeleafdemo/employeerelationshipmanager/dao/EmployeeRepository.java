package com.luv2code.springboot.thymeleafdemo.employeerelationshipmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.springboot.thymeleafdemo.employeerelationshipmanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
