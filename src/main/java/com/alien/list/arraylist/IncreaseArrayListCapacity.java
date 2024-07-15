package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program to Increase the Current Capacity of an ArrayList

public class IncreaseArrayListCapacity {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");

		list.ensureCapacity(100);

		for (int i = 0; i < 95; i++) {
			list.add("New Element " + i);
		}

		System.out.println("Size of the ArrayList after additions: " + list.size());
	}
}
