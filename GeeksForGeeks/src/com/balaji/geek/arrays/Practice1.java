//Smallest subarray with all occurrences of a most frequent element
package com.balaji.geek.arrays;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
	public static void smallestArray(int[] inArr) {
		Map<Integer, Integer> elementsCount = new HashMap<>();
		Map<Integer, Integer> startIndex = new HashMap<>();
		int maxCount = 0;
		int[] maxElement = new int[inArr.length];
		int in = 0;
		for (int a : inArr) {
			int count = 0;
			if (elementsCount.get(a) != null) {
				int i = elementsCount.get(a) + 1;
				elementsCount.put(a, i);
				count = i;

			} else {
				elementsCount.put(a, 1);
				count = 1;
				startIndex.put(a, in);
			}
			if (maxCount < count)
				maxCount = count;
			in++;
		}
		System.out.println("Count of Elements");
		int i = 0;
		for (Map.Entry<Integer, Integer> e : elementsCount.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
			if (e.getValue() == maxCount) {
				maxElement[i] = e.getKey();
				i++;
			}
		}
		System.out.println("Starting Indexes of all elements");
		for (Map.Entry<Integer, Integer> e : startIndex.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("Elements having Maximum count " + maxCount + " are :");
		for (int j = 0; j < i; j++)
			System.out.println(maxElement[j]);
	}

	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 1, 2, 1, 4, 3, 2, 1, 2, 4, 5, 3, 3 };
		smallestArray(inputArray);
	}
}
