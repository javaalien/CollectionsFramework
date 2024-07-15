package com.alien.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> waitingQueue = new LinkedList<>();

		// Adding new elements to the Queue (The Enqueue operation)
		waitingQueue.add("Rajeev");
		waitingQueue.add("Chris");
		waitingQueue.add("John");
		waitingQueue.add("Mark");
		waitingQueue.add("Steven");

		System.out.println("WaitingQueue : " + waitingQueue);

		String name = waitingQueue.remove();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

		name = waitingQueue.poll();

		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

	}
}
