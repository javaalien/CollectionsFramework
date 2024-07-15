package com.alien.list.arraylist;

import java.util.ArrayList;

//  Java Program to Implement Queue Using ArrayList

public class QueueUsingArrayList {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<>();

		queue.enqueue("Java");
		queue.enqueue("Python");
		queue.enqueue("C++");

		System.out.println("Front element (peek): " + queue.peek());

		System.out.println("Dequeue element: " + queue.dequeue());
		System.out.println("Dequeue element: " + queue.dequeue());

		System.out.println("Front element (peek) after dequeues: " + queue.peek());
	}
}

class Queue<T> {
	private ArrayList<T> elements;

	public Queue() {
		elements = new ArrayList<>();
	}

	public void enqueue(T item) {
		elements.add(item);
	}

	public T dequeue() {
		if (isEmpty())
			throw new IllegalStateException("Cannot dequeue from an empty queue.");

		return elements.remove(0);
	}

	public T peek() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");

		return elements.get(0);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}
}