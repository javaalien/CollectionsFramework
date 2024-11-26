package com.alien.collectionUtility;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String input = "java";

		char[] chars = input.toCharArray();

		Arrays.sort(chars);

		String sortedString = new String(chars);

		System.out.println("Sorted String: " + sortedString);
	}
}
