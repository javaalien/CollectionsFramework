package com.alien.queue;

import java.util.PriorityQueue;

public class CreatePriorityQueueString {

	public static void main(String[] args) {

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

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
