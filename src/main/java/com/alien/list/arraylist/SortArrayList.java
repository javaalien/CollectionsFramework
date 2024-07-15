package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Java Program to Sort an ArrayList

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Australia");
		countries.add("South Africa");
		countries.add("Denmark");

		// Step 2: Sorting the ArrayList of Strings
		Collections.sort(countries);
		System.out.println("Sorted ArrayList of Strings: " + countries);

		// Step 3: Creating and populating an ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(3);

		// Step 4: Sorting the ArrayList of Integers
		numbers.sort(Comparator.naturalOrder());
		System.out.println("Sorted ArrayList of Integers: " + numbers);

	}
}
