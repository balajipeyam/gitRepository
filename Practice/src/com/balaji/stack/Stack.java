package com.balaji.stack;

public interface Stack<T> {

	public void push(T t) throws StackSizeException;

	public T pop() throws StackSizeException;

	public boolean isEmpty();
}
