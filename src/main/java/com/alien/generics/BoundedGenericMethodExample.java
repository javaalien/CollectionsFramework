package com.alien.generics;

public class BoundedGenericMethodExample {

	public static <T extends Number> void printDoubleValue(T value) {
		System.out.println(value.doubleValue());
	}

	public static void main(String[] args) {

		printDoubleValue(10); // Integer
		printDoubleValue(3.14); // Double
		printDoubleValue(5.67f); // Float

	}

}
