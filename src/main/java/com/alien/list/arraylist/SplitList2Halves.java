package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Split a List into Two Halves in Java

public class SplitList2Halves {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");
		list.add("Alien");

		List[] lists = split(list);

		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}

	private static List[] split(List<String> list) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		int size = list.size();

		for (int i = 0; i < size / 2; i++) {
			list1.add(list.get(i));
		}

		for (int i = size / 2; i < size; i++) {
			list2.add(list.get(i));
		}

		return new List[] { list1, list2 };
	}
}
