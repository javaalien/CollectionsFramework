package com.alien.list;

import java.util.Collections;
import java.util.LinkedList;

// How do you reverse a Linked List?

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		System.out.println("Original linked List" + list1);

		LinkedList<Integer> list2 = new LinkedList<>();

		list1.descendingIterator().forEachRemaining(list2::add);

		System.out.println("Reversed linked List" + list2);

	}

}
