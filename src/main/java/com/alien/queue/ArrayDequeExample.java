package com.alien.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();

		deque.add("element1");
		deque.add("element2");
		deque.add("element3");
		deque.add("element4");
		deque.add("element5");

		for (String str : deque) {
			System.out.println(str);
		}
	}
}
