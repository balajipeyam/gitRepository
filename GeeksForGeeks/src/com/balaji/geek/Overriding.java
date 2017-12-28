package com.balaji.geek;


class Animal {
	public Animal() {
		System.out.println("Animal Class");
	}

	public void move() {
		System.out.println("Animal Moving");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog Class");
	}

	public void move() {
		System.out.println("Dog Moving");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		Dog d = new Dog();
		d.move();
		Animal a1 = new Dog();
		a1.move();
	}
}
