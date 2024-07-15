package com.alien.list.arraylist;

import java.util.ArrayList;

// Java Program to Add Elements to an ArrayList

public class AddElementsToArrayList {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");	
		fruits.add("Cherry");

		System.out.println("ArrayList after adding elements: " + fruits);

		fruits.add(1, "Blueberry");

		System.out.println("ArrayList after inserting Blueberry at index 1: " + fruits);

	}
}
