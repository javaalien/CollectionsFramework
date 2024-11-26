package com.alien.collectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWrappersExample {

	public static void main(String[] args) {
		sortWrapperClassObjectsInAsc();
	}

	private static void sortWrapperClassObjectsInAsc() {
		List<Integer> names = new ArrayList<>();
		names.add(100);
		names.add(20);
		names.add(10);
		names.add(50);
		
		System.out.println("Sort Integer in Ascending Order");

		System.out.println("Before Sorting : " + names);
		Collections.sort(names);
		System.out.println("After Sorting : " + names);

		System.out.println("\nSort Integer in Descending Order");
		
		System.out.println("Before Sorting : " + names);
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("After Sorting : " + names);
	}
}
