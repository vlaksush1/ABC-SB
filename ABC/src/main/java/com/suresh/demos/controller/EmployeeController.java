package com.suresh.demos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suresh.demos.model.Employee;
import com.suresh.demos.service.EmployeeService;



@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		Employee e = new Employee();
	
		return service.getTest();
	}

	/**
	 * 
	 * @param employee
	 * @return
	 */
	
	
//	@RequestMapping(value = "/save",method = RequestMethod.POST)
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
//		empService.save(employee);
//		logger.debug("Added:: " + employee);
//		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
//	}
	
	
	@PostMapping(path = "/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		service.save(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}

	@GetMapping(path = "/list")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = service.findAll();
		if (employees.isEmpty()) {			
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);			
	}
	
	
}
