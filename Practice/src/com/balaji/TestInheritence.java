package com.balaji;

class A {
	public A() {
		System.out.println("Parent Constructor");
	}

	static {
		System.out.println("Parent Static");
	}
	{
		System.out.println("Parent block");
	}

	public void take(String a) {
		System.out.println("Parent : " + a);
	}

	public void print() {
		System.out.println("Printing from parent");
	}
}

class Child1 extends A {
	public Child1() {
		System.out.println("Child1 Constructor");
	}

	static {
		System.out.println("Child1 Static");
	}
	{
		System.out.println("Child1 Block");
	}

	@Override
	public void take(String a) {
		System.out.println("Child1 : " + a);
	}
}

class Child2 extends A {
	public Child2() {
		System.out.println("Child2 Constructor");
	}

	static {
		System.out.println("Child2 Static");
	}
	{
		System.out.println("Child2 Block");
	}

	@Override
	public void take(String a) {
		System.out.println("Child2 : " + a);
	}
}

public class TestInheritence extends A {
	public static void main(String[] args) {
		// A a1 = new A();
		// A a1 = new Child1();

		Child2 a1 = new Child2();
		a1.take("Balaji");
		a1.print();
	}
}
