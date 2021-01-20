package com.luv2code.springboot.thymeleafdemo.employeerelationshipmanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.springboot.thymeleafdemo.employeerelationshipmanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { 
	
	public List<Employee> findAllByOrderByLastNameAsc();
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
