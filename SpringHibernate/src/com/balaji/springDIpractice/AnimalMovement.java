// Annotation based Spring beans
package com.balaji.springDIpractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

interface Animal {
	String movement();
}

@Service
class Dog implements Animal {

	@Override
	public String movement() {
		return "Dog Walks";
	}

}

@Service
class Fish implements Animal {

	@Override
	public String movement() {
		return "Fish Swims";
	}

}

public class AnimalMovement {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		BeanFactory beanFactory = context;
		Dog dog = (Dog) beanFactory.getBean("dog");
		Fish fish = (Fish) beanFactory.getBean("fish");
		System.out.println(dog.movement());
		System.out.println(fish.movement());

	}

}