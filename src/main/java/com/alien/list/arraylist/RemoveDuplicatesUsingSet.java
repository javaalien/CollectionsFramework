package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// How To Remove Duplicate Elements From ArrayList In Java

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");

		Set<String> set = new HashSet<>(list);

		list.clear();

		list.addAll(set);

		System.out.println("List after removing duplicates: " + list);
	}
}
