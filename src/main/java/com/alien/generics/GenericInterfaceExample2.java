package com.alien.generics;

interface Pair<K, V> {
	K getKey();

	V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}

public class GenericInterfaceExample2 {

	public static void main(String[] args) {

		Pair<String, Integer> pair = new OrderedPair<>("one", 1);
		System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());

		Pair<Integer, String> anotherPair = new OrderedPair<>(2, "Two");

		System.out.println("Key: " + anotherPair.getKey() + ", Value: " + anotherPair.getValue());

	}
}
