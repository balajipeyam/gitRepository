package com.balaji.collections;

import java.util.Hashtable;
import java.util.Map;

class Employee {
	private int empId;
	private String empName;
	private float salary;

	public Employee(int id, String name, float salary) {
		empId = id;
		empName = name;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class MapPractice {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Balaji", 300);
		Employee e2 = new Employee(2, "ALgates", 200);
		Employee e3 = new Employee(3, "Ramu", 100);
		Employee e4 = new Employee(4, "Vidu", 400);
		Employee e5 = new Employee(5, "Loki", 500);
		Employee e6 = new Employee(6, "Pavi", 500);
		Map<Integer, Employee> map = new Hashtable<Integer, Employee>();
		map.put(e1.getEmpId(), e1);
		map.put(e2.getEmpId(), e2);
		map.put(e3.getEmpId(), e3);
		map.put(e4.getEmpId(), e4);
		map.put(e5.getEmpId(), e5);
		map.putIfAbsent(e6.getEmpId(), e6);

		System.out.println("Elements in Map");
		for (Map.Entry<Integer, Employee> m : map.entrySet()) {
			System.out.println("Key Value : " + m.getKey() + ". Values : " + m.getValue().getEmpId() + "\t"
					+ m.getValue().getEmpName() + "\t" + m.getValue().getSalary());
		}
		System.out.println("Element values in Map");
		for (Employee e : map.values())
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getSalary());
		System.out.println("Keys in Map");
		for (Integer i : map.keySet())
			System.out.println(i);

	}

}
