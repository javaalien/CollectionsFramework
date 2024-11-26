package com.alien.collectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorterInASCDESC {

	public static void main(String[] args) {

		sortUserDefinedObjectsInAsc();

	}

	private static void sortUserDefinedObjectsInAsc() {

		List<Person> persons = new ArrayList<Person>();

		Person person1 = new Person(59, "John", 40);
		Person person2 = new Person(67, "Roger", 25);
		Person person3 = new Person(45, "Steven", 30);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		System.out.println("Sort in Ascending order");
		
		System.out.println("Before Sorting : " + persons);
		Collections.sort(persons);
		System.out.println("After Sorting : " + persons);

		System.out.println("\nSort in decending order");
		
		System.out.println("Before Sorting : " + persons);
		Collections.sort(persons, Collections.reverseOrder());
		System.out.println("After Sorting : " + persons);

	}
}
