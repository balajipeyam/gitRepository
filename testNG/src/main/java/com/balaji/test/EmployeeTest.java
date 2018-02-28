package com.balaji.test;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeTest {
	Employee emp = new Employee().setEmployeeName("Balaji").setEmployeeSalary(1000);

	@BeforeMethod(enabled = false)
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod(enabled = false)
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeTest(enabled = false)
	public void beforeTest() {
		System.out.println("Before test");
	}

	@AfterTest(enabled = false)
	public void afterTest() {
		System.out.println("After test");
	}

	@Test(timeOut = 5000, dependsOnGroups = { "group1" }, enabled = false)
	public void testEmployeeName() {
		String name = emp.getEmployeeName();
		Assert.assertEquals("Balaji", name);
		System.out.println("name success");
	}

	@Test(groups = "group1", enabled = false)
	public void testEmployeeSalary() {
		int salary = emp.getEmployeeSalary();
		Assert.assertEquals(1000, salary);
		System.out.println("salary success");
	}

	@Test(expectedExceptions = ArithmeticException.class, enabled = false)
	public void testArithmeticException() {
		System.out.println("Arithmetic exception");
		int i = 10 / 0;
	}

	@BeforeSuite(enabled = false)
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite(enabled = false)
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeGroups("group1")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}

	@AfterGroups("group1")
	public void afterGroups() {
		System.out.println("After Groups");
	}

	@Test(dataProvider = "salaryinput", groups = "group1", invocationCount = 3)
	public void divisionMethod(int a, int b) {
		int result = a / 10;
		Assert.assertEquals(result, b);
		System.out.println(result);
	}

	@DataProvider
	public Object[][] salaryinput() {
		Object[][] obj = { { 20, 2 }, { 60, 6 }, { 30, 3 }, { 25, 2 } };
		return obj;
	}

	@Test(groups = "group1")
	public void testListener() {
		Employee emp = EmployeeListener.employee;
		System.out.println(emp.getEmployeeSalary());
	}
}
