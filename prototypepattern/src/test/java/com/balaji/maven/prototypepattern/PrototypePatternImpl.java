package com.balaji.maven.prototypepattern;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrototypePatternImpl implements Cloneable {

	private List<Employees> empList;

	public PrototypePatternImpl() {
		empList = new ArrayList<Employees>();
	}

	public PrototypePatternImpl(List<Employees> empList) {
		this.empList = empList;
	}

	public List<Employees> getEmpList() {
		return empList;
	}

	public void loadData() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		this.empList = EmployeeManagement.getAllEmployees(session);
		session.close();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<Employees> temp = new ArrayList<Employees>();
		for (Employees emp : empList) {
			Employees e = new Employees();
			e.setEmpId(emp.getEmpId());
			e.setEmpName(emp.getEmpName());
			e.setEmpEmail(emp.getEmpEmail());
			temp.add(e);
		}
		return new PrototypePatternImpl(temp);
	}
}
