package com.balaji.sortalgorithms;

import java.util.Arrays;

public class SelectionSort {
	private int[] array;

	public SelectionSort(int[] array) {
		this.array = array;
	}

	public int[] sort() {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			System.out.println("Iteration " + i + Arrays.toString(array));
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array1 = { 9, 7, 2, 2, 3, 9, 4, 5, 7, 9, 1 };
		SelectionSort b = new SelectionSort(array1);
		System.out.println("Input Array : " + Arrays.toString(array1));
		array1 = b.sort();
		System.out.println("Sorted Array :" + Arrays.toString(array1));
	}
}
