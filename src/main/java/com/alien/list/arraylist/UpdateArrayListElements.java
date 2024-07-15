package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program to Update ArrayList Elements

public class UpdateArrayListElements {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		System.out.println("Original ArrayList: " + cars);

		// Updating an element at a specific index
		cars.set(1, "Tesla"); // Updating the second element (index 1)

		// Displaying the ArrayList after updates
		System.out.println("Updated ArrayList: " + cars);

	}
}
