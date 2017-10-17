package com.balaji.hackerrank;

import java.io.*;
import java.util.*;

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
		Node2 returnHead = null;
		if (head == null)
			return returnHead;
		else if (head.next == null) {
			returnHead.data = head.data;
			returnHead.next = null;
		} else {
			System.out.println("Adding " + head.data + " to set");
			allListValues.add(head.data);
			while (head.next != null) {
				head = head.next;
				System.out.println("Adding " + head.data + " to set");
				if (!allListValues.add(head.data)) {
					head=head.next;

				} else {
					Node2 cur = head;
					Node2 next = head.next;

				}
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
