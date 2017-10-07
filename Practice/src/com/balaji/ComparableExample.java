package com.balaji;

import java.util.Arrays;

class Student implements Comparable<Student> {
	private int studentID;
	private String name;
	private String dept;

	public Student(int studentID, String name, String dept) {
		this.name = name;
		this.dept = dept;
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "[id=" + this.studentID + ", name=" + this.name + ", age=" + this.dept + "]";
	}

	public int compareTo(Student s) {
		return (this.studentID - s.studentID);
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		Student[] studentArray = new Student[4];
		studentArray[0] = new Student(100, "Balaji", "CSE");
		studentArray[1] = new Student(99, "Peyam", "ME");
		studentArray[2] = new Student(121, "Algates", "EC");
		studentArray[3] = new Student(30, "VIDU", "IT");
		Arrays.sort(studentArray);
		System.out.println("Default Sorting of Students list:\n" + Arrays.toString(studentArray));
	}

}