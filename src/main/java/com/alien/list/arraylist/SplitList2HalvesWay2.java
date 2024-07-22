package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.List;

// Split a List into Two Halves in Java

public class SplitList2HalvesWay2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");
		list.add("Alien");

		int size = list.size();

		List<String> list1 = new ArrayList<>(list.subList(0, size / 2));
		List<String> list2 = new ArrayList<>(list.subList(size / 2, size));

		System.out.println(list1);
		System.out.println(list2);

	}
}
