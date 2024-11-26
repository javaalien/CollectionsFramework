package com.alien.stack;

import java.util.Stack;

public class ArrayToStackExample {

	public static void main(String[] args) {
		convertArrayToStack();
	}

	private static void convertArrayToStack() {
		String[] strArr = { "Java", "JEE", "C", "C++", "Spring", "Hibernate" };

		Stack<String> stack = new Stack<>();

		for (String str : strArr) {
			stack.push(str);
		}

		System.out.println("Non-Empty stack : " + stack);

		System.out.println("Is stack empty: " + stack.empty());
		System.out.println("Non-Empty stack : " + stack);

	}
}
