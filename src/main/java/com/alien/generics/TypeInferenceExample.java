package com.alien.generics;

public class TypeInferenceExample {

	public static void main(String[] args) {

		GenericClass<Integer> intObj = new GenericClass<>();

		intObj.setValue(1090);
		System.out.println("Integer Value: " + intObj.getValue());

		GenericClass<String> stringObj = new GenericClass<>();

		stringObj.setValue("Java Generics");
		System.out.println("String Value: " + stringObj.getValue());

	}

}
