package com.balaji.springDIpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedDI {
	private int studentID;
	private String studentName;

	public ConstructorBasedDI(int id, String name) {
		this.studentID = id;
		this.studentName = name;
	}

	public void displayStudent() {
		System.out.println(studentID + "\t" + studentName);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ConstructorBasedDI student = (ConstructorBasedDI) context.getBean("ConstructorBasedDI");
		student.displayStudent();
	}
}
