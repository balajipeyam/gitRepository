package com.balaji.hackerrank;

import java.util.Scanner;

class Calculator {
	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		else {
			if (p > 1)
				return n * power(n, p - 1);
			else if (p == 1)
				return n;
			else if (p == 0)
				return 1;
			return n;
		}
	}
}

public class Day17 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
