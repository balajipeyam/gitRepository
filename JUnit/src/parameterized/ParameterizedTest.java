package parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private int a;
	private int b;
	private int sum;
	private int difference;
	private static MyClass myClass;

	@BeforeClass
	public static void init() {
		myClass = new MyClass();
	}

	public ParameterizedTest(int a, int b, int sum, int difference) {
		this.a = a;
		this.b = b;
		this.sum = sum;
		this.difference = difference;
	}

	@Parameterized.Parameters
	public static Collection testData() {
		return Arrays.asList(new Object[][] { { 2, 3, 5, -1 }, { 4, 4, 8, 0 }, { 6, 8, 14, -2 }, { 10, 8, 18, 2 } });
	}

	@Test
	public void testAdd() {
		System.out.println("Sum of " + a + " and " + b + " = " + sum);
		Assert.assertEquals(sum, myClass.add(a, b));
	}

	@Test
	public void testSubstract() {
		System.out.println("Difference of " + a + " and " + b + " = " + difference);
		Assert.assertEquals(difference, myClass.substract(a, b));
	}

}
