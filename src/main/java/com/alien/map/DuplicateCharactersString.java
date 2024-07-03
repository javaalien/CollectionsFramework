package com.alien.map;

import java.util.HashMap;
import java.util.Map;

// Write a Java Program to find the duplicate characters in a string.

public class DuplicateCharactersString {

	public static void main(String[] args) {

		String str = "javaalien";

		findDuplicates(str);

	}

	private static void findDuplicates(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");

		}
	}
}
