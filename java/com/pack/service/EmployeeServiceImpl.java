package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.EmployeeDAO;
import com.pack.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO dao) {
	
		this.dao = dao;
	}

	@Override
	public List<Employee> finadAll() {
		
		return dao.finadAll();
	}

	@Override
	public Employee findById(Integer theId) {
		
		return dao.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee employee) {
		
		return dao.save(employee);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);

	}

}
