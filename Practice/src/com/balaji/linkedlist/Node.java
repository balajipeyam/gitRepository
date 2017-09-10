package com.balaji.linkedlist;

public class Node<T> {
	private T nodeValue;
	private Node<T> linkNode;

	public void setLink(Node<T> t) {
		linkNode = t;
	}

	public Node<T> getLink() {
		return linkNode;
	}

	public T getData() {
		return nodeValue;
	}

	public void setData(T t) {
		System.out.println(t+" : added");
		nodeValue = t;
	}
}
