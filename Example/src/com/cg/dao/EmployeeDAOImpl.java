package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public Employee addEmployee(Employee emp) {
		entitymanager.persist(emp);
		entitymanager.flush();
		return emp;
	}

}
