package com.balaji.sortalgorithms;

import java.util.Arrays;

public class BubbleSort {

	private int[] array;

	public BubbleSort(int[] array) {
		this.array = array;
	}

	public int[] sort() {
		// pushing the highest element to the end of the array,
		// reducing array size and repeating for remaining elements
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				int temp = 0;
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array1 = { 9, 7, 2, 2, 3, 9, 4, 5, 7, 9, 1 };
		BubbleSort b = new BubbleSort(array1);
		System.out.println("Input Array : " + Arrays.toString(array1));
		array1 = b.sort();
		System.out.println("Sorted Array :" + Arrays.toString(array1));
	}

}
