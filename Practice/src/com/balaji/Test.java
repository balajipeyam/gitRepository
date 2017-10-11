package com.balaji;

@FunctionalInterface
interface interfaceTest {
	void method(int a, int b);
}

public class Test {
	public static void main(String[] args) {

		interfaceTest testIn = (int a, int b) -> {
			System.out.println("Hello" + a + b);

		};
		testIn.method(12, 13);
	}

}
