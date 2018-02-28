package com.balaji;

public class SpiralTraversal2DArray {

	public void spiralTraverse(int[][] input) {
		int top = 0, right = input.length - 1, bottom = input.length - 1, left = 0;
		while (top <= bottom || left <= right) {

			// left to right traversal
			for (int i = left; i <= right; i++)
				System.out.println(input[top][i]);

			top++;

			// top to bottom traversal
			for (int i = top; i <= right; i++)
				System.out.println(input[i][right]);

			right--;

			// right to left traversal
			for (int i = right; i >= left; i--)
				System.out.println(input[bottom][i]);

			bottom--;

			// bottom to top traversal
			for (int i = bottom; i >= top; i--)
				System.out.println(input[i][left]);

			left++;
		}

	}

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] input2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SpiralTraversal2DArray spiral = new SpiralTraversal2DArray();
		spiral.spiralTraverse(input2);
	}
}
