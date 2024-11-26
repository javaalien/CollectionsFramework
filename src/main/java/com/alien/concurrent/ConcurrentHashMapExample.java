package com.alien.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		//HashMap<Integer, String> map = new HashMap<>();
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "chetan");
		map.put(3, "kavya");
		map.put(2, "alien");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() == 1)
				map.remove(entry.getKey());
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(map);

	}
}
