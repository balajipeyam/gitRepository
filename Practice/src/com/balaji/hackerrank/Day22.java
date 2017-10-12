package com.balaji.hackerrank;

import java.util.Scanner;

class BinaryTreeNode {
	BinaryTreeNode left, right;
	int data;

	BinaryTreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22 {
	public static int getHeight(BinaryTreeNode root) {
		int leftHeight = 0;
		int rightHeight = 0;
		if (root == null)
			return 0;
		else {
			if (root.left != null)
				leftHeight = 1 + getHeight(root.left);
			if (root.right != null)
				rightHeight = 1 + getHeight(root.right);
			return Math.max(leftHeight, rightHeight);
		}
	}

	public static BinaryTreeNode insert(BinaryTreeNode root, int data) {
		if (root == null) {
			return new BinaryTreeNode(data);
		} else {
			BinaryTreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BinaryTreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
