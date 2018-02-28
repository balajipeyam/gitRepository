package com.balaji;

public class Student {
	private int studentID;
	private String studentName;

	public void displayStudentInfo() {
		System.out.println("Student ID : " + studentID + "\tStudent Name : " + studentName);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
