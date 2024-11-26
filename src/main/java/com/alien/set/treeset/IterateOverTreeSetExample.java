package com.alien.set.treeset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class IterateOverTreeSetExample {

	public static void main(String[] args) {

		SortedSet<String> fruits = new TreeSet<>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");

		System.out.println("=== Iterate over a HashSet using iterator() ===");

		Iterator<String> fruitIterator = fruits.iterator();
		while (fruitIterator.hasNext()) {
			String fruit = fruitIterator.next();
			System.out.println(fruit);
		}

		System.out.println("=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
		fruitIterator = fruits.iterator();

		fruitIterator.forEachRemaining((fruit) -> {
			System.out.println(fruit);
		});

	}
}
