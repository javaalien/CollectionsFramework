package com.alien.generics;

class GenericClasses<T extends Number> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class BoundedTypeParameterExample {

	public static void main(String[] args) {

		GenericClasses<Integer> intObj = new GenericClasses<>();
		intObj.setValue(100);
		System.out.println("Integer Value: " + intObj.getValue());

		GenericClasses<Double> doubleObj = new GenericClasses<>();
		doubleObj.setValue(45.67);
		System.out.println("Double Value: " + doubleObj.getValue());

		// The following line will cause a compile-time error

		// GenericClasses<String> stringObj = new GenericClasses<>();
		
	}
}
