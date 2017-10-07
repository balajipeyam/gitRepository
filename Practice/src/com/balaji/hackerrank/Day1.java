package com.balaji.hackerrank;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		i = i + scan.nextInt();
		scan.nextLine();
		d = d + scan.nextDouble();
		scan.nextLine();
		s = s + scan.nextLine();

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		scan.close();
	}
}