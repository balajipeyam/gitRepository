package com.balaji.geek.arrays;

//Minimum swaps required to bring all elements less than or equal to k together
public class Practice8 {

	public void maxrequiredSwaps(int[] input, int k) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] <= k)
				count++;
		}
		int maxcount = 0, startIndex = 0;
		for (int i = 0; i < input.length - count; i++) {
			int temp = 0;
			for (int j = i; j < i + count; j++) {
				if (input[j] <= k)
					temp++;
			}
			if (temp > maxcount) {
				maxcount = temp;
				startIndex = i;
			}
		}
		System.out.println((count - maxcount) + " swaps to be made between indexes " + startIndex + " and "
				+ (startIndex + count - 1));
	}

	public static void main(String[] args) {
		int[] input = {2, 1, 5, 6, 3};
		int k = 3;
		Practice8 p = new Practice8();
		p.maxrequiredSwaps(input, k);
	}
}
