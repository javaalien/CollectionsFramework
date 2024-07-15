package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Java Program to Synchronize an ArrayList

public class SynchronizeArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");

		List<String> synchList = Collections.synchronizedList(list);

		Thread thread1 = new Thread(() -> {

			synchronized (synchList) {
				synchList.forEach(System.out::println);
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (synchList) {
				synchList.add("javascript");
				System.out.println("Added Javascript");
			}
		});

		thread1.start();
		thread2.start();

	}
}
