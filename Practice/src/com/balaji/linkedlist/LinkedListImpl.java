package com.balaji.linkedlist;

public class LinkedListImpl<T> implements LinkedList<T> {
	private Node<T> currentNode = new Node<T>();
	// private Node<T> tail = new Node<T>();

	@Override
	public void addFront(T t) {
		if (isEmpty()) {
			currentNode.setData(t);
			// tail = currentNode;
		} else {
			Node<T> temp = new Node<T>();
			temp.setData(t);
			temp.setLink(currentNode);
			currentNode = temp;
		}
	}

	@Override
	public void addAfter(T element, T newElement) {
		Node<T> newNode = new Node<T>();
		Node<T> tempNode = currentNode;
		if (isEmpty())
			System.out.println("Empty Linked list, unable to find the given element");
		else {
			while (tempNode.getData() != element && tempNode.getLink() != null)
				tempNode = tempNode.getLink();
			if (tempNode.getData() != element)
				System.out.println("Element match not found, cannot insert new element");
			else {
				newNode.setData(newElement);
				newNode.setLink(tempNode.getLink());
				tempNode.setLink(newNode);
			}
		}
	}

	@Override
	public void add(T t) {
		if (isEmpty()) {
			System.out.println("Addisng first element in New List");
			currentNode.setData(t);
			// tail = currentNode;
		} else {
			Node<T> temp = new Node<T>();
			temp.setData(t);
			// tail.setLink(temp);
			// tail = temp;
		}
	}

	@Override
	public void deleteFront() {
		System.out.println("Removing the first element :" + currentNode.getData());
		if (currentNode.getLink() == null) {
			currentNode = null;
			// tail = null;
		} else
			currentNode = currentNode.getLink();
	}

	@Override
	public void deleteEnd() {
		if (currentNode.getLink() == null) {
			currentNode = null;
			// tail = null;
		} else {
			Node<T> tempNode = new Node<T>();
			Node<T> prevNode = new Node<T>();
			tempNode = currentNode;
			while (tempNode.getLink() != null) {
				prevNode = tempNode;
				tempNode = tempNode.getLink();
			}
			prevNode.setLink(null);
			// tail = prevNode;
		}
	}

	@Override
	public void deleteAfter(T t) {
		Node<T> tempNode = new Node<T>();
		Node<T> refNode = new Node<T>();
		tempNode = currentNode;
		if (isEmpty())
			System.out.println("No Elements in the list, cannot delete");
		else if (currentNode.getLink() == null)
			System.out.println("Only 1 element in the list, cannot delete any");
		else {
			while (tempNode.getData() != t && tempNode.getLink() != null)
				tempNode = tempNode.getLink();
			if (tempNode.getLink() != null) {
				refNode = tempNode.getLink();
				tempNode.setLink(refNode.getLink());
			} else
				System.out.println("Reference element " + t + " not found, cannot remove any element");
		}
	}

	@Override
	public void printList() {
		if (isEmpty())
			System.out.println("Empty list");
		else {
			Node<T> tempNode = new Node<T>();
			tempNode = currentNode;
			while (tempNode.getLink() != null) {
				System.out.println(tempNode.getData());
				tempNode = tempNode.getLink();
			}
			System.out.println(tempNode.getData());
		}
	}

	@Override
	public void clearList() {
		currentNode = null;
		// tail = null;
	}

	@Override
	public boolean isEmpty() {
		if (currentNode.getData() == null)
			return true;
		return false;
	}

	public static void main(String[] args) {
		LinkedListImpl<String> linkedList = new LinkedListImpl<String>();
		linkedList.printList();
		linkedList.add("Balaji");
		linkedList.add("Algates");
		linkedList.add("Vidu");
		linkedList.add("Ramu");
		linkedList.addFront("Lokeesh");
		linkedList.addAfter("Algates", "Peyam");
		linkedList.deleteEnd();
		linkedList.deleteFront();
		linkedList.deleteAfter("Algates");
		linkedList.printList();
	}
}
