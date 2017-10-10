package com.balaji.hackerrank;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] allElements) {
		elements = allElements;
	}

	public void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++)
				maximumDifference = (Math.abs(elements[i] - elements[j]) > maximumDifference)
						? Math.abs(elements[i] - elements[j]) : maximumDifference;
		}
	}
}

public class Day14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
