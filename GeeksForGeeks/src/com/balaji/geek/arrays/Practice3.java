//Count pairs in array whose sum is divisible by 4

package com.balaji.geek.arrays;

public class Practice3 {

	public static void main(String[] args) {

		int[] inpArray = { 1, 3, 2, 1, 3, 2, 5, 6, 4, 4, 0, 0, 0 };

		int[] modulusFrequency = { 0, 0, 0, 0 };

		for (int i = 0; i < inpArray.length; i++) {

			if (inpArray[i] % 4 == 0)

				modulusFrequency[0]++;

			else if (inpArray[i] % 4 == 1)

				modulusFrequency[1]++;

			else if (inpArray[i] % 4 == 2)

				modulusFrequency[2]++;

			else if (inpArray[i] % 4 == 3)

				modulusFrequency[3]++;

		}

		for (int i : modulusFrequency)

			System.out.println(i);

		int sum = ((modulusFrequency[0]) * (modulusFrequency[0] - 1) / 2) + modulusFrequency[1] * modulusFrequency[3]

				+ ((modulusFrequency[2]) * (modulusFrequency[2] - 1) / 2);

		System.out.println(sum);

	}

}
