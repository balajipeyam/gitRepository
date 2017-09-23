package com.balaji.maven.prototypepattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employees {
	@Id
	@Column(name = "empid")
	private int empId;
	@Column(name = "name")
	private String empName;
	@Column(name = "email")
	private String empEmail;

	public Employees() {
	}

	public Employees(int id, String name, String email) {
		this.empId = id;
		this.empName = name;
		this.empEmail = email;
		System.out.println("New Employee Created : \n" + this.toString());
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		String s = "Employee Details : " + this.empId + "\t" + this.empName + "\t" + this.empEmail;
		return s;
	}
}
