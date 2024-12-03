package com.alien.generics;

class NumberBox<T extends Number> {
	private T value;

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	public double doubleValue() {
		return value.doubleValue();
	}

}

public class BoundedTypeParameterExample2 {

	public static void main(String[] args) {
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.set(123);
		System.out.println("Integer Value: " + intBox.get());
		System.out.println("Double Value: " + intBox.doubleValue());
		System.out.println();
		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.set(45.67);
		System.out.println("Double Value: " + doubleBox.get());
		System.out.println("Double Value: " + doubleBox.doubleValue());

	}
}
