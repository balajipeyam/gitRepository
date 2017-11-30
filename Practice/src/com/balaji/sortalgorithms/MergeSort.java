package com.balaji.sortalgorithms;

import javax.swing.text.Highlighter;

public class MergeSort {
	private int[] array;
	private int length;
	private int[] tempArray;

	public void sort(int[] array) {
		this.array = array;
		this.length = array.length;
		tempArray = new int[length];
		mergeSort(0, length - 1);
	}

	public void mergeSort(int lowerIndex, int UpperIndex) {
		if (lowerIndex < UpperIndex) {
			int middle = lowerIndex + (UpperIndex - lowerIndex) / 2;
			mergeSort(lowerIndex, middle);
			mergeSort(middle + 1, UpperIndex);
			mergeParts(lowerIndex, middle, UpperIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int upperIndex) {
		for (int i = lowerIndex; i <= upperIndex; i++)
			tempArray[i] = array[i];
		int l = lowerIndex;
		int m = middle + 1;
		int k = lowerIndex;
		while (l <= middle && m <= upperIndex) {
				
		}
	}

	public static void main(String[] args) {

	}

}
