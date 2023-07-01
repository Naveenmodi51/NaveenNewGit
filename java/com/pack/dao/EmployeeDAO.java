package com.pack.dao;

import java.util.List;

import com.pack.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> finadAll();
	
	Employee findById(Integer theId);
	
	Employee save(Employee employee);
	
	void deleteById(Integer id);

}
