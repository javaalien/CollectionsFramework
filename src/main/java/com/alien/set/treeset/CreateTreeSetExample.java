package com.alien.set.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {

	public static void main(String[] args) {

		SortedSet<String> fruits = new TreeSet<>();

		// Adding new elements to a TreeSet
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");

		System.out.println("Fruits Set : " + fruits);

		// Duplicate elements are ignored
		fruits.add("Apple");
		System.out.println("After adding duplicate element \"Apple\" : " + fruits);

		// This will be allowed because it's in lowercase.
		fruits.add("banana");
		System.out.println("After adding \"banana\" : " + fruits);

		String first = fruits.first();
		System.out.println("First element : " + first);

		String last = fruits.last();
		System.out.println("Last element : " + last);

		Comparator<?> comparator = fruits.comparator();

		SortedSet<String> tailSet = fruits.tailSet("Oarange");
		System.out.println("tailSet :" + tailSet);

	}
}
