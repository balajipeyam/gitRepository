package com.balaji.linkedlist;

public interface LinkedList<T> {
	public void addFront(T t);

	public void addAfter(T node, T newNode);

	public void add(T t);

	public void deleteFront();

	public void deleteEnd();

	public void deleteAfter(T t);

	public boolean isEmpty();

	public void clearList();

	public void printList();

}
