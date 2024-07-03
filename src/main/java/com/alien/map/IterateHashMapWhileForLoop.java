package com.alien.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Write a Java Program to iterate HashMap using While and advance for loop.

public class IterateHashMapWhileForLoop {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		System.out.println("Using advanced for-loop");
		map.put("Virat", "kohli");
		map.put("MS", "Dhoni");
		map.put("Sachin", "Tendulkar");
		map.put("Rahul", "Dravid");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("=============================================================");
		System.out.println("Using while-loop with iterator");

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

}
