package com.suresh.demos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.demos.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
