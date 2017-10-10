package com.balaji.hackerrank;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	public char calculate() {
		int totalScore = 0;
		for (int i = 0; i < testScores.length; i++)
			totalScore += testScores[i];
		int averageScore = totalScore / testScores.length;
		if (averageScore < 40)
			return 'T';
		else if (averageScore >= 40 && averageScore < 55)
			return 'D';
		else if (averageScore >= 55 && averageScore < 70)
			return 'P';
		else if (averageScore >= 70 && averageScore < 80)
			return 'A';
		else if (averageScore >= 80 && averageScore < 90)
			return 'E';
		else if (averageScore >= 90 && averageScore <= 100)
			return 'O';
		return 0;
	}
}

public class Day12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}