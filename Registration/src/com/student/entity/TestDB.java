package com.student.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.student.dao.HibernateImpl;

public class TestDB {
	public static void main(String[] args) {
		HibernateImpl hibernate = new HibernateImpl();
		Session session = hibernate.createHibernateSession();
		session.beginTransaction();
		Student student = session.get(Student.class, 3);
		BorrowBook b1 = new BorrowBook();
		b1.setBookID(3);
		b1.setBookName("Advanced JAVA");
		b1.setStudent(student);
		session.save(b1);

		BorrowBook b2 = new BorrowBook();
		b2.setBookID(4);
		b2.setBookName("Advanced REST");
		b2.setStudent(student);
		session.save(b2);
		session.getTransaction().commit();
		List<BorrowBook> borrowHistory = session.createCriteria(BorrowBook.class).list();
		Iterator<BorrowBook> itr = borrowHistory.iterator();
		while (itr.hasNext()) {
			BorrowBook b = itr.next();
			System.out.println(b.toString());
		}
		session.close();

	}

}
