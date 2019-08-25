package com.suresh.demos.model;

import javax.persistence.*;

@Entity
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
