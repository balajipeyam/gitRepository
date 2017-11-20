package com.balaji.maven.prototypepattern;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateImpl {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		// Employees e = new Employees(5, "Ramu", "ramu@gmail.com");
		Employees e2 = EmployeeManagement.getEmployee(session, 4);
		System.out.println(e2.toString());
		List<Employees> allEmps = EmployeeManagement.getAllEmployees(session);
		for (Employees emp : allEmps)
			System.out.println(emp.toString());
		session.close();
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory2 = configuration.configure().buildSessionFactory();
		Session session2 = sessionFactory2.openSession();
	}

}
