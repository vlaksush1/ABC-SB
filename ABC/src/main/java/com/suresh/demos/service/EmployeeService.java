package com.suresh.demos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.demos.dao.EmployeeRepository;
import com.suresh.demos.model.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository repository;

	public String getTest(){
		return "Testing";
	}
	
	public String save(Employee employee) {
		repository.save(employee);	
		return "Saved";
	}
}
