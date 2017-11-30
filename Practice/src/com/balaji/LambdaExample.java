package com.balaji;

interface LambdaTest {
	void method(int a);
}

public class LambdaExample {
	public static void main(String[] args) {
		LambdaTest test = (int a) -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(a + " X " + i + " = " + a * i);
			}
		};
		test.method(12);
	}
}
