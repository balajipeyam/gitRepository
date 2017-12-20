package com.student.service;

import java.util.List;

import com.student.entity.Response;
import com.student.entity.Student;

public interface StudentService {

	Response registerStudent(Student s);

	Response deleteStudent(int studentID);

	Student getStudent(int studentID);

	List<Student> getAllStudents();

	Response updateStudent(Student s);

}
