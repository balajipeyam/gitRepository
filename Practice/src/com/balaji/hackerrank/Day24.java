package com.balaji.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node2 {
	int data;
	Node2 next;

	Node2(int d) {
		data = d;
		next = null;
	}

}

public class Day24 {
	public static Node2 removeDuplicates(Node2 head) {
		Set<Integer> allListValues = new HashSet<Integer>();
		if (head == null || head.next == null)
			return head;
		else {
			Node2 temp = head;
			allListValues.add(temp.data);
			while (temp.next != null) {
				Node2 next = temp.next;
				if (!allListValues.add(next.data))
					temp.next = next.next;
				else
					temp = next;
			}
		}
		return head;
	}

	public static Node2 insert(Node2 head, int data) {
		Node2 p = new Node2(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node2 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node2 head) {
		Node2 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node2 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}

}
