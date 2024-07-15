package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program to Compare Two ArrayLists

public class CompareArrayLists {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Python");
		list1.add("C++");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("Python");
		list2.add("C++");

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Python");
		list3.add("C++");
		list3.add("Java");

		boolean isEqual = list1.equals(list2); // Checks for equality including order
		System.out.println("list1 equals list2: " + isEqual);

		boolean isContained = list1.containsAll(list3);
		System.out.println("list1 contains all elements of list3: " + isContained);

	}
}
