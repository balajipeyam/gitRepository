package com.balaji.geek;


enum Animals {
	Dog("barks"), Lion("Roars");
	String sound;

	private Animals(String s) {
		sound = s;
	}

	public String AnimalsMovement() {
		System.out.println(sound);
		String m;
		if (sound == Dog.sound)
			m = "Dog Walks";
		else
			m = "Lion Runs";
		return m;

	}
}

enum Vehicles {
	Bike, Car, Scooter;
}

public class EnumExample {
	public static void main(String[] args) {
		System.out.println(Animals.Dog.sound + " and " + Animals.Lion.sound);
		System.out.println(Animals.Dog.AnimalsMovement());
		System.out.println(Animals.Dog.sound + " and " + Animals.Lion.sound);
		System.out.println(Animals.Lion.AnimalsMovement());
		for (Animals animals : Animals.values()) {
			System.out.println(animals + animals.sound);
		}
		for (Vehicles vehicles : Vehicles.values()) {
			System.out.println(vehicles);

		}
	}
}
