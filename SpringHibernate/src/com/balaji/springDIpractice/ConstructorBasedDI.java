package com.balaji.springDIpractice;

<<<<<<< Upstream, based on branch 'master' of https://github.com/balajipeyam/gitRepository.git
=======
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
>>>>>>> 8f71139 Infy Laptop
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedDI {
	private int studentID;
	private String studentName;

	@Autowired
	public ConstructorBasedDI(@Value("1") int id, @Value("Balaji") String name) {
		this.studentID = id;
		this.studentName = name;
	}

	public void displayStudent() {
		System.out.println(studentID + "\t" + studentName);
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
<<<<<<< Upstream, based on branch 'master' of https://github.com/balajipeyam/gitRepository.git
		ConstructorBasedDI student = (ConstructorBasedDI) context.getBean("ConstructorBasedDI");
=======
		BeanFactory beanFactory = context;
		ConstructorBasedDI student = (ConstructorBasedDI) beanFactory.getBean("constructorBasedDI");
>>>>>>> 8f71139 Infy Laptop
		student.displayStudent();
	}
}
