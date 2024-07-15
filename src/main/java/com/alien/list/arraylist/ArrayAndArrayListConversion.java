package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java Program to Convert Array to ArrayList and Vice Versa

public class ArrayAndArrayListConversion {

	public static void main(String[] args) {

		String[] array = { "Java", "Python", "C++" };

		List<String> list = new ArrayList<>(Arrays.asList(array));

		System.out.println("Array to ArrayList: " + list);

		ArrayList<String> listOfLanguages = new ArrayList<>();
		listOfLanguages.add("JavaScript");
		listOfLanguages.add("TypeScript");
		listOfLanguages.add("Kotlin");

		String[] languageArray = listOfLanguages.toArray(new String[0]);

		System.out.println("ArrayList to Array: " + Arrays.toString(languageArray));

	}
}
