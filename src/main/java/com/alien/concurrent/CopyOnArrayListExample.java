package com.alien.concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListExample {

	public static void main(String[] args) {

		//ArrayList<Integer> list = new ArrayList<>();
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (Integer i : list) {

			if (i == 4) {
				list.remove(i);
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n"+list);
	}
}
