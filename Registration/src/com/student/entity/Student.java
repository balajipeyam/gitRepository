package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "student_id")
	private int studentID;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "student_department")
	private String studentDept;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Address studentAddress;

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int id) {
		this.studentID = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	@Override
	public String toString() {

		return "Student ID : " + this.studentID + "\tStudent Name : " + this.studentName + "\tDepartment : "
				+ this.studentDept;
	}
}
