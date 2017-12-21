//Partition into two subarrays of lengths k and (N – k) such that the difference of sums is maximum
package com.balaji.geek.arrays;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		int[] inputArray = { 3, 2, 4, 1, 3, 4, 2, 5, 8, 9 };
		int k = 5;
		if (k > (inputArray.length / 2))
			k = inputArray.length - k;
		int[] smallArray = new int[k];
		int[] largeArray = new int[inputArray.length - k];
		Arrays.sort(inputArray);
		int j = 0;
		int smallArraySum = 0;
		int largeArraySum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (i < k) {
				smallArraySum = smallArraySum + inputArray[i];
				smallArray[i] = inputArray[i];
			} else {
				largeArraySum = largeArraySum + inputArray[i];
				largeArray[j] = inputArray[i];
				j++;
			}
		}

		System.out.println("Smaller Array Elements : ");
		for (int i : smallArray)
			System.out.println(i);

		System.out.println("Larger Array Elements : ");
		for (int i : largeArray)
			System.out.println(i);

		System.out.println("Largest difference is " + Math.abs(largeArraySum - smallArraySum));
	}
}
