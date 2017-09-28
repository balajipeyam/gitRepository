package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	
	@Before
	public void before(){
		System.out.println("Before every method");
	}
	
	@Test
	public void test1(){
		System.out.println("Test execution 1");
	}
	
	@Test
	public void test2(){
		System.out.println("Test execution 2");
	}
	
	@After
	public void after(){
		System.out.println("After every method");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}
	
}
