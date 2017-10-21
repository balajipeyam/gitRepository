package com.balaji.hackerrank;

import java.util.Scanner;

public class Day26 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int returnedDay = s.nextInt();
		int returnedMonth = s.nextInt();
		int returnedYear = s.nextInt();
		int expectedDay = s.nextInt();
		int expectedMonth = s.nextInt();
		int expectedYear = s.nextInt();
		int fine = 0;
		fine = (returnedYear == expectedYear)
				? (returnedMonth == expectedMonth) ? (returnedDay > expectedDay) ? 15 * (returnedDay - expectedDay) : 0
						: (returnedMonth > expectedMonth) ? 500 * (returnedMonth - expectedMonth) : 0
				: (returnedYear > expectedYear) ? 10000 : 0;
		System.out.println(fine);

	}
}
