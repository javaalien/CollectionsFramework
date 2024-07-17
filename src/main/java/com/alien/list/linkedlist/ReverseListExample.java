package com.alien.list.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Java Program to Reverse a List

public class ReverseListExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Original list: " + numbers);

		Collections.reverse(numbers);

		System.out.println("Reversed list: " + numbers);

	}
}
