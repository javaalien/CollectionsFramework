package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Java Program to Get Minimum and Maximum From a List

public class MaxMinFromList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// add element in ArrayList object list
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(66);
		list.add(55);

		// print min and max value of ArrayList
		System.out.println("Way 1 :===>");
		System.out.println("Min: " + findMin(list));
		System.out.println("Max: " + findMax(list));

		System.out.println("Way 2====>");
		System.out.println("Min: " + findMinWay2(list));
		System.out.println("Max: " + findMaxWay2(list));

	}

	private static int findMax(List<Integer> list) {

		List<Integer> collect = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		return collect.get(0);
	}

	private static int findMin(List<Integer> list) {

		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

		return collect.get(0);
	}

	private static int findMaxWay2(List<Integer> list) {

		return Collections.max(list);
	}

	private static int findMinWay2(List<Integer> list) {

		return Collections.min(list);
	}
}
