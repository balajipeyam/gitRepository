package com.balaji.geek.arrays;

import java.util.Arrays;

public class Practice4 {

	public static void main(String[] args) {
		int inputArray[] = { 3, 1, 0, 4, 3, 5, 9, 6, 4, 6, 2, 2 };
		Arrays.sort(inputArray);
		int totalArraySum = 0;
		for (int i = 0; i < inputArray.length; i++)
			totalArraySum = totalArraySum + inputArray[i];
		System.out.println("Total sum of all elements in the array is : " + totalArraySum);
		String subsetArray = "";
		int subsetArraySum = 0;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (subsetArraySum <= totalArraySum / 2) {
				subsetArraySum = subsetArraySum + inputArray[i];
				subsetArray = inputArray[i] + " " + subsetArray;
			}
		}
		System.out.println(subsetArray.trim());
	}
}
