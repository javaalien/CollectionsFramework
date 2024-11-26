package com.alien.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListToStackExample {

	public static void main(String[] args) {
		convertListToStack();
	}

	private static void convertListToStack() {
		Stack<String> stack = new Stack<>();
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JEE");
		list.add("C");
		list.add("C++");
		list.add("Spring");
		list.add("Hibernate");

		System.out.println("Non-Empty stack addAll Operation : " + stack.addAll(list));

		System.out.println("Non-Empty stack : " + stack);

	}
}
