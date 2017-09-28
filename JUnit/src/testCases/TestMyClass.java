package testCases;

import org.junit.Assert;
import org.junit.Test;

public class TestMyClass {

	MyClass myClass = new MyClass();

	@Test
	public void testAdd() {
		int sum = myClass.add(6, 2);
		Assert.assertEquals(8, sum);
	}

	@Test
	public void testAdd1() {
		int sum = myClass.add(9, 3);
		Assert.assertEquals(12, sum);
	}

	@Test
	public void testAdd2() {
		int sum = myClass.add(14, 5);
		Assert.assertEquals(19, sum);
	}

	@Test
	public void testSubtract() {
		int difference = myClass.subtract(6, 2);
		Assert.assertEquals(4, difference);
	}

	@Test
	public void testMultiply() {
		int product = myClass.multiply(6, 2);
		Assert.assertEquals(12, product);
	}

	@Test
	public void testDivide() {
		int quotient = myClass.divide(6, 2);
		Assert.assertEquals(3, quotient);
	}

}
