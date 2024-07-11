package com.alien.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparator {

	public static void main(String[] args) {
		Comparator<String> stringLengthComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

		namePriorityQueue.add("Lisa");
		namePriorityQueue.add("Robert");
		namePriorityQueue.add("John");
		namePriorityQueue.add("Chris");
		namePriorityQueue.add("Angelina");
		namePriorityQueue.add("Joe");

		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}
	}
}
