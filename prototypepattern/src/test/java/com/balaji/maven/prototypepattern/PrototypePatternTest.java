package com.balaji.maven.prototypepattern;

import java.util.List;

public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypePatternImpl impl = new PrototypePatternImpl();
		impl.loadData();

		PrototypePatternImpl test1 = (PrototypePatternImpl) impl.clone();
		PrototypePatternImpl test2 = (PrototypePatternImpl) impl.clone();

		List<Employees> list1 = test1.getEmpList();
		List<Employees> list2 = test2.getEmpList();

		Employees e1 = new Employees(5, "Five", "Five@gmail.com");
		Employees e2 = new Employees(6, "Six", "six@gmail.com");
		list1.add(e1);
		list2.add(e2);
		System.out.println("Original Data");
		for (Employees e : impl.getEmpList())
			System.out.println(e.toString());
		System.out.println("Clone 1");
		for (Employees e : list1)
			System.out.println(e.toString());
		System.out.println("Clone 2");
		for (Employees e : list2)
			System.out.println(e.toString());
	}

}
