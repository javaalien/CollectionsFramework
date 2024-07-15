package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program for Searching Elements in an ArrayList

public class SearchArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");

		// Step 2: Checking if an element exists using contains()
		boolean exists = list.contains("Python");
		System.out.println("Does the list contain Python? " + exists);

		// Step 3: Finding the index of an element using indexOf()
		int index = list.indexOf("C++");
		System.out.println("Index of C++ in the list: " + index);
	}

}
