package com.alien.list;

import java.util.ArrayList;
import java.util.List;

// Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

public class IterateArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("Spring Boot");
		list.add("Microservices");
		list.add("Apache Kafka");

		iterateList(list);
	}

	public static void iterateList(List<String> list) {
		// Using for-loop
		System.out.println("Using for-loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================================");
		// Using while-loop
		System.out.println("Using while-loop");
		int j = 0;
		while (j < list.size()) {
			System.out.println(list.get(j));
			j++;
		}
		System.out.println("==========================================");
		// Using advanced for-loop
		System.out.println("Using advanced for-loop");
		for (String item : list) {
			System.out.println(item);
		}
	}
}
