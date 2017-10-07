package com.balaji.designpatterns;

abstract class Animal {
	public abstract String getMovement();

}

class Dog extends Animal {

	@Override
	public String getMovement() {
		return "Dog walks";
	}

}

class Fish extends Animal {

	@Override
	public String getMovement() {
		return "Fish Swims";
	}

}

class AnimalFactory {
	public static Animal getAnimalMovement(String string) {
		if (string.equalsIgnoreCase("dog"))
			return new Dog();
		else if (string.equalsIgnoreCase("fish"))
			return new Fish();
		throw new IllegalArgumentException("No such Animal");
	}
}

public class Factory {
	public static void main(String[] args) {

		Animal animal = AnimalFactory.getAnimalMovement("fish");
		System.out.println(animal.getMovement());

	}
}