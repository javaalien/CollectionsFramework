package com.alien.list.arraylist;

import java.util.ArrayList;

// Find common elements in two ArrayLists in Java

public class FindCommonFromTwoArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();

		// Add values in ArrayList
		list1.add("INDIA");
		list1.add("ENGLAND");
		list1.add("USA");
		list1.add("RUSSIA");
		list1.add("FRANCE");
		list1.add("SPAIN");

		ArrayList<String> list2 = new ArrayList<String>();

		// Add values in ArrayList
		list2.add("INDIA");
		list2.add("ITALY");
		list2.add("CANADA");
		list2.add("SPAIN");
		list2.add("FRANCE");
		list2.add("CHINA");

		list1.retainAll(list2);

		System.out.println(list1);

	}
}
