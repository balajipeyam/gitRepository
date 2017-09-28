package testCases;

import org.junit.Assert;
import org.junit.Test;

public class TestMyClass2 {
	
	MyClass2 myClass = new MyClass2();
	
	@Test
	public void testAdd(){
		String hello = myClass.hello();
		Assert.assertEquals("hello", hello);
	}
}
