package com.balaji.stack;

public class StackImplementation<T> implements Stack<T> {

	private Object[] stack = new Object[20];
	private int index = 0;

	public void push(T t) throws StackSizeException {
		try {
			stack[index] = t;
			index++;
		} catch (ArrayIndexOutOfBoundsException exception) {
			throw new StackSizeException("Exceeded Stack Size, cannot pust element into the stack");
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() throws StackSizeException {

		if (!isEmpty()) {
			index--;
			return (T) stack[index];
		}

		throw new StackSizeException("Stack is empty");
	}

	@Override
	public boolean isEmpty() {
		if (index > 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws StackSizeException {
		StackImplementation<Integer> stack1 = new StackImplementation<Integer>();
		Integer s = null;

		s = stack1.pop();
		System.out.println(s);
		stack1.push(18);
		stack1.push(9);
		s = stack1.pop();
		System.out.println(s);
		s = stack1.pop();
		System.out.println(s);
		s = stack1.pop();
		System.out.println(s);

	}
}
