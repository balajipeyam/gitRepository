package com.algates.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Employee {
	private String name;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public Employee setSalary(int salary) {
		this.salary = salary;
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public void printEmployeeName() {
		System.out.println(this.getName());
	}

	public void printEmployeeName(String nameAddition) {
		System.out.println(this.getName() + nameAddition);
	}

	public void printEmployeeSalary() {
		System.out.println(this.getSalary());
	}

	public void printEmployeeSalary(int salaryIncrement) {
		System.out.println(this.getSalary() + salaryIncrement);
	}

}

@FunctionalInterface
interface EmployeePrint {

	void printEmployeedetails(List<Employee> empList);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Employee e1 = new Employee().setName("e1").setSalary(1000);
		Employee e2 = new Employee().setName("e2").setSalary(2000);
		Employee e3 = new Employee().setName("e3").setSalary(3000);

		List<Employee> l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);

		// using Functional Interface
		EmployeePrint printEmployeeValues = empList -> {
			for (Employee e : empList)
				System.out.println(e.getName() + " : Employee : " + e.getSalary());
		};
		printEmployeeValues.printEmployeedetails(l);

		// forEach on Iterator
		l.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee e) {
				System.out.println(e.getName() + " : " + e.getSalary());
			}
		});
	}

}
