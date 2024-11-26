package com.alien.collectionUtility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortStringDescending {

	public static void main(String[] args) {

		String input = "java";

		Character[] chars = new Character[input.length()];

		for (int i = 0; i < input.length(); i++) {
			chars[i] = input.charAt(i);
		}

		Arrays.sort(chars, Collections.reverseOrder());

		StringBuilder sortedString = new StringBuilder(chars.length);
		for (Character ch : chars) {
			sortedString.append(ch.charValue());
		}

		System.out.println("Sorted String in Descending Order: " + sortedString.toString());

	}
}
