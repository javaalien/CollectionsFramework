package com.alien.generics;

interface GenericInterface<T> {
	void display(T value);
}

class GenericInterfaceImpl<T> implements GenericInterface<T> {

	@Override
	public void display(Object value) {
		System.out.println(value);
	}
}

public class GenericInterfaceExample {

	public static void main(String[] args) {

		GenericInterface<String> stringImpl = new GenericInterfaceImpl<>();

		stringImpl.display("Hello Generics");

		GenericInterface<Integer> intImpl = new GenericInterfaceImpl<>();
		intImpl.display(123);

	}
}
