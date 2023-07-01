package com.pack.service;

import java.util.List;

import com.pack.entity.Employee;

public interface EmployeeService {
	
List<Employee> finadAll();
	
	Employee findById(Integer theId);
	
	Employee save(Employee employee);
	
	void deleteById(Integer id);

}
