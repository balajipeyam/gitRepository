package com.student.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_borrow")
public class BorrowBook {
	@Id
	@Column(name = "book_id")
	private int bookID;
	@Column(name = "book_name")
	private String bookName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Book ID : " + this.getBookID() + "\t Book Name : " + this.getBookName() + "\t Student Name : "
				+ this.getStudent().getStudentName();
	}
}
