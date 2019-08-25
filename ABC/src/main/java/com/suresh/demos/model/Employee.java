package com.suresh.demos.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.jndi.cosnaming.IiopUrl.Address;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Employee")
@Getter
@Setter
public class Employee {	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "employee_sequence")
	@SequenceGenerator(name="employee_sequence",sequenceName = "employee_sequence",initialValue = 101,allocationSize = 1)
	private int eno;
	


	@Column(name="ename",length = 20)
	private String ename;
	
	@Column(name="desig",length = 20)
	private String desig;

	@Column(name="salary")
	private int salary;	
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@ManyToOne
	@JoinColumn(name="dno")
	private Department dept;
	
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
