package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java Program to Filter Elements in an ArrayList

public class FilterArrayListElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		List<Integer> filteredNumbers = numbers.stream()
				.filter(number -> number % 2 == 0).collect(Collectors.toList());

		System.out.println("Filtered ArrayList (Even Numbers): " + filteredNumbers);
	}
}
