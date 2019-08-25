package com.suresh.demos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.demos.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
