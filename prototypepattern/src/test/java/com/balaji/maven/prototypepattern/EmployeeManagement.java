package com.balaji.maven.prototypepattern;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

public class EmployeeManagement {

	public static void addEmployee(Session session, Employees emp) throws ConstraintViolationException {
		Transaction transaction = session.beginTransaction();
		try {
			session.save(emp);
		} catch (Exception e) {
			System.out.println(
					"Exception occured : Primary Key Constraint Violated. Unable to insert teh object into Database");
		}
		transaction.commit();

	}

	@SuppressWarnings("rawtypes")
	public static Employees getEmployee(Session session, int empId) {
		Query query = session.createQuery("from Employees where empId = :id");
		query.setParameter("id", empId);
		Employees e = (Employees) query.uniqueResult();
		// Employees e = session.get(Employees.class, empId);
		return e;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Employees> getAllEmployees(Session session) {
		Query query = session.createQuery("from Employees");
		List<Employees> allEmployees = query.list();
		return allEmployees;
	}
}
