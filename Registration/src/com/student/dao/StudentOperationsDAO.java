package com.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import com.student.entity.Student;

public class StudentOperationsDAO {
	public void addNewStudentDAO(Student student) throws ConstraintViolationException {
		HibernateImpl hibernate = new HibernateImpl();
		Session session = hibernate.createHibernateSession();
		session.beginTransaction();
		try {
			session.save(student);
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
		}
		session.getTransaction().commit();
		session.close();
	}

	public Student getStudentDAO(int id) throws ConstraintViolationException {
		Student student = new Student();
		HibernateImpl hibernate = new HibernateImpl();
		Session session = hibernate.createHibernateSession();
		session.beginTransaction();
		try {
			student = session.get(Student.class, id);
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
		}
		session.close();
		return student;
	}

	public List<Student> getAllStudentsDAO() {
		HibernateImpl hibernate = new HibernateImpl();
		Session session = hibernate.createHibernateSession();
		session.beginTransaction();
		List<Student> students = session.createCriteria(Student.class).list();
		session.close();
		return students;
	}

	public void removeStudentDAO(int id) {
		HibernateImpl hibernate = new HibernateImpl();
		Session session = hibernate.createHibernateSession();
		session.beginTransaction();
		Student student = getStudentDAO(id);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}

}
