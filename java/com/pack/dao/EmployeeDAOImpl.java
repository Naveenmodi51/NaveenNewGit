package com.pack.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> finadAll() {

		TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

		List<Employee> employees = query.getResultList();
		return employees;

	}

	@Override
	public Employee findById(Integer theId) {

		Employee employee = entityManager.find(Employee.class, theId);

		return employee;
	}

	@Override
	public Employee save(Employee employee) {
		
		Employee dbEmployee=entityManager.merge(employee);
		
		return dbEmployee;
	}

	@Override
	public void deleteById(Integer id) {
		
		Employee theEmployee=entityManager.find(Employee.class, id);
	    entityManager.remove(theEmployee);

	}

}
