package com.attilavarga.employee.relationship.manager.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.attilavarga.employee.relationship.manager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { 
	public List<Employee> findAllByOrderByLastNameAsc();
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);
}
