package com.balaji.hackerrank;

import java.util.Scanner;

public class Day25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int num = s.nextInt();
			String output = "Prime";
			if (num == 1)
				output = "Not prime";
			else {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if (num % j == 0)
						output = "Not prime";
				}
			}
			System.out.println(output);
		}
		s.close();
	}

}
