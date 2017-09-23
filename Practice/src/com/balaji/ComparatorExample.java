package com.balaji;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private int employeeID;
	private String employeeName;
	private int employeeSalary;

	public Employee(int employeeID, String employeeName, int employeeSalary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public static Comparator<Employee> IDcomparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeID() - o2.getEmployeeID();
		}
	};
	public static Comparator<Employee> IDcomparator2 = (o1, o2) -> o1.getEmployeeID() - o2.getEmployeeID();

	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
	};
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.employeeSalary - o2.employeeSalary;
		}
	};

	@Override
	public String toString() {
		return "[id=" + this.employeeID + ", name=" + this.employeeName + ", Role=" + ", Salary=" + this.employeeSalary
				+ "]";

	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		Employee[] empArray = new Employee[4];
		empArray[0] = new Employee(101, "Balaji Peyam", 10000);
		empArray[1] = new Employee(99, "Alagappan M", 15000);
		empArray[2] = new Employee(73, "Vidu", 13000);
		empArray[3] = new Employee(121, "Ramu", 20000);
		System.out.println("Unsorted : " + Arrays.toString(empArray));
		// Consuming existing Comparator
		// Arrays.sort(empArray, Employee.IDcomparator2);
		// System.out.println(Arrays.toString(empArray));

		// Client side comparator implementation
		Arrays.sort(empArray, (a, b) -> a.getEmployeeID() - b.getEmployeeID());
		System.out.println("Sort by ID : " + Arrays.toString(empArray));

		Arrays.sort(empArray, Employee.NameComparator);
		System.out.println("Sort by Name : " + Arrays.toString(empArray));

		Arrays.sort(empArray, Employee.SalaryComparator);
		System.out.println("Sort by salary : " + Arrays.toString(empArray));
	}

}
