package com.alien.map.linkedhashmap;

import java.util.LinkedHashMap;

public class CreateLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

		// Adding new key-value pairs to the LinkedHashMap
		wordNumberMapping.put("one", 1);
		wordNumberMapping.put("two", 2);
		wordNumberMapping.put("three", 3);
		wordNumberMapping.put("four", 4);

		wordNumberMapping.putIfAbsent("five", 5);

		System.out.println(wordNumberMapping);

	}
}
