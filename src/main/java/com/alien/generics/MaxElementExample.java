package com.alien.generics;

import java.util.Arrays;
import java.util.List;

// Generic method to find the maximum element in a list

public class MaxElementExample {

	public static <T extends Comparable<T>> T findMax(List<T> list) {
		T max = list.get(0);

		for (T element : list) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Max Integer: " + findMax(intList));

		List<String> strList = Arrays.asList("Apple", "Orange", "Banana", "Peach");
		System.out.println("Max String: " + findMax(strList));
	}	
}
