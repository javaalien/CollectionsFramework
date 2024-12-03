package com.alien.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.println(elem);
		}
	}

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		List<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		stringList.add("Generics");

		printList(intList);
		printList(stringList);

	}
}
