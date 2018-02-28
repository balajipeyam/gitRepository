//Implementing Stack using Linked List
interface StackInterface<T> {
	void pop();

	void push(T t);

	boolean isEmpty();
}

class Node<T> {
	private T data;
	private Node<T> link;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLink() {
		return link;
	}

	public void setLink(Node<T> link) {
		this.link = link;
	}
}

public class StackNodeImpl<T> implements StackInterface<T> {
	private Node<T> headNode = new Node();

	@Override
	public void pop() {
		if (isEmpty())
			System.out.println("Stack is empty, cannot pop");
		else {
			T data = headNode.getData();
			headNode = headNode.getLink();
			System.out.println(data + " has been popped from stack");
		}

	}

	@Override
	public void push(T t) {
		Node<T> temp = new Node<T>();
		temp.setData(t);
		if (isEmpty()) {
			headNode = temp;
			System.out.println(headNode.getData() + " has been pushed to stack");
		} else {
			temp.setLink(headNode);
			headNode = temp;
			System.out.println(headNode.getData() + " has been pushed to stack");
		}
	}

	public void printStackElements() {
		Node<T> temp = new Node();
		temp = headNode;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getLink();
		}
	}

	@Override
	public boolean isEmpty() {
		if (headNode == null)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		StackNodeImpl<Integer> s = new StackNodeImpl<Integer>();
		s.push(3);
		s.push(4);
		s.pop();
		s.pop();
		s.push(10);
		s.push(9);
		s.push(19);
		s.pop();
		s.push(909);
		s.printStackElements();

	}

}
