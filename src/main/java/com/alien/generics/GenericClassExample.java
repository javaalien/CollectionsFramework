package com.alien.generics;

class GenericClass<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class GenericClassExample {

	public static void main(String[] args) {

		GenericClass<Integer> genericClass = new GenericClass<>();
		genericClass.setValue(20);
		System.out.println("Integer Value: " + genericClass.getValue());

		GenericClass<String> stringObj = new GenericClass<>();
		stringObj.setValue("Java Alien");

		System.out.println("String Value: " + stringObj.getValue());

	}
}
