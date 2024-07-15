package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// How To Remove Duplicate Elements From ArrayList In Java

public class RemoveDuplicatesUsingCustomMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");

		// Remove duplicates using a custom method
		list = removeDuplicates(list);

		System.out.println("List after removing duplicates: " + list);

	}

	private static List<String> removeDuplicates(List<String> list) {

		List<String> newList = new ArrayList<>();

		for (String element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}

		return newList;
	}
}
