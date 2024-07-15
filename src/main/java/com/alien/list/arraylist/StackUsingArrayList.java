package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program to Implement Stack Using ArrayList

public class StackUsingArrayList {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		stack.push("java");
		stack.push("python");
		stack.push("C++");

		System.out.println("Top element (peek): " + stack.peek());
		
		System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());
        
        System.out.println("Top element (peek) after pops: " + stack.peek());

	}
}

class Stack<T> {
	private ArrayList<T> elements;

	public Stack() {
		elements = new ArrayList<>();
	}

	public void push(T item) {
		elements.add(item);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Cannot pop from an empty stack.");
		}
		return elements.remove(elements.size() - 1);
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Cannot peek from an empty stack.");
		}
		return elements.get(elements.size() - 1);
	}

	private boolean isEmpty() {
		return elements.isEmpty();
	}
}