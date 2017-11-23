package com.balaji.springDIpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
class Address {
	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

@Service
public class Employee {
	private int empId;
	private String empName;
	private Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void testDI(int i, String n, String s, String c) {
		empId = i;
		empName = n;
		address.setStreet(s);
		address.setCity(c);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		BeanFactory beanFactory = context;
		Employee emp = (Employee) beanFactory.getBean("employee");

		emp.testDI(1, "balaji", "Gachibowli", "Hyderabad");
		System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getAddress().getStreet() + "\t"
				+ emp.getAddress().getCity());
	}
}
