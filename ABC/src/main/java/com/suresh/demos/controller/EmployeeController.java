package com.suresh.demos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	return service.getTest();
}


/**
 * 
 * @param employee
 * @return
 */
@PostMapping(path= "/add")
@ResponseBody
public String addEmployee(@RequestBody Employee employee) {
	try {
	String str = service.save(employee);
	System.out.println(str);
	return str;
	}
	catch(Exception e) {
		return e.getMessage();
	}
}


}
