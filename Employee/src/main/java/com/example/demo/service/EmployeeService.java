package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeRepo;
import com.example.demo.entity.Employee;

@Service

public class EmployeeService  implements EmployeeServiceImpl{
	
	@Autowired
    EmployeeRepo emprepo;	
	

	@Override
	public Employee addEmployee(Employee employee) {

		return emprepo.save(employee);
	}
	
	
	
	

}
