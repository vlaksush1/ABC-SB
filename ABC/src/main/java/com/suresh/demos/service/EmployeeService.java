package com.suresh.demos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.suresh.demos.dao.DepartmentRepository;
import com.suresh.demos.dao.EmployeeRepository;
import com.suresh.demos.model.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

@Autowired
DepartmentRepository departmentRepository;

	public String getTest(){
		return "Testing";
	}
	
	public String save(Employee employee) {
		employeeRepository.save(employee);	
		return "Saved";
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();		
	}
}
