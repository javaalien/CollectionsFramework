package com.alien.queue;

import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(11);
		queue.add(10);
		queue.add(23);
		queue.add(7);
		queue.add(12);
		queue.add(3);

		while (queue.isEmpty() == false) {
			System.out.printf("%d ", queue.remove());
		}
		System.out.println("\n");
	}
}
