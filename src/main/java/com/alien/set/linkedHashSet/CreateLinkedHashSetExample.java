package com.alien.set.linkedHashSet;

import java.util.LinkedHashSet;

public class CreateLinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> daysOfWeek = new LinkedHashSet<>();

		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");

		daysOfWeek.add("Monday");

		System.out.println(daysOfWeek);

	}
}
