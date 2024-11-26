package com.alien.stack;

import java.util.Stack;

public class StackMethodExample {

	public static void main(String[] args) {
		peekMethod();
	}

	private static void peekMethod() {
		Stack<String> stack = new Stack<>();

		// populating stack
		stack.push("Java");
		stack.push("JEE");
		stack.push("C");
		stack.push("C++");
		stack.push("Spring");
		stack.push("Hibernate");

		System.out.println("Top object is: " + stack.peek());
		System.out.println("Searching 'Spring' in stack: " + stack.search("Spring"));

		System.out.println("Removed object is: " + stack.pop());

		System.out.println("Elements after remove: " + stack);
	}

}
