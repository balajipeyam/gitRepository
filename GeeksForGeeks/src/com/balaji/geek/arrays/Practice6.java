//Minimum number of subsets with distinct elements
package com.balaji.geek.arrays;

import java.util.HashMap;
import java.util.Map;

public class Practice6 {
	public static void main(String[] args) {
		int[] inputArray = { 2, 1, 3, 4, 2, 3, 1, 2, 5, 6, 7, 6 };
		// {1,2,3,4,5,6,7},{1,2,3,6},{2}
		Map<Integer, Integer> inputMap = new HashMap<>();
		int max = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputMap.get(inputArray[i]) == null)
				inputMap.put(inputArray[i], 1);
			else
				inputMap.put(inputArray[i], inputMap.get(inputArray[i]) + 1);

			if (max < inputMap.get(inputArray[i]))
				max = inputMap.get(inputArray[i]);

		}
		System.out.println("Minimun Subsets required : " + max);

		// double for loop..need to be avoided
		for (int i = 1; i <= max; i++) {
			String subset = "";
			for (Map.Entry<Integer, Integer> m : inputMap.entrySet()) {
				if (m.getValue() >= i)
					subset = subset + m.getKey() + " ";
			}
			System.out.println("Subset " + i + " is {" + subset.trim() + "}");
		}
	}
}
