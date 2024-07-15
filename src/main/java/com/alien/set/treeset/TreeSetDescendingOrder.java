package com.alien.set.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrder {

	public static void main(String[] args) {

		SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder()); // Descending  Order

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");

		System.out.println("Fruits Set : " + fruits);

	}
}
