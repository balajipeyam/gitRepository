package com.balaji.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Balaji", 300);
		Employee e2 = new Employee(2, "ALgates", 200);
		Employee e3 = new Employee(3, "Ramu", 100);
		Employee e4 = new Employee(4, "Vidu", 400);
		Employee e5 = new Employee(5, "Loki", 500);
		Employee e6 = new Employee(6, "Pavi", 500);

		Set<Employee> set1 = new HashSet<Employee>();

		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);
		set1.add(e6);

		System.out.println("Set 1 using Iterator");
		Iterator<Employee> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			Employee e = itr1.next();
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getSalary());
		}
		System.out.println("Set 1 with for loop");
		for (Employee e : set1)
			System.out.println(e.getEmpId() + "\t" + e.getEmpName() + "\t" + e.getSalary());

	}
}
