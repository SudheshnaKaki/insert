package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IEmployeeDAO;
import com.cg.entity.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDAO employeeDAO;

	@Override
	public Employee addEmployeeData(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(emp);
	}

}
