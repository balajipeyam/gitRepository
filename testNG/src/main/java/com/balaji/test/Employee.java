package com.balaji.test;

public class Employee {

	private String employeeName;
	private int employeeSalary;

	public String getEmployeeName() {
		return employeeName;
	}

	public Employee setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public Employee setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
		return this;
	}

	public int divisionMethod(int a, int b) {
		return a / b;
	}

}
