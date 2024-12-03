package com.alien.generics;

public class GenericMethodExample {

	public <T> void print(T param) {
		System.out.println(param.getClass().getName() + " = " + param);
	}

	public static void main(String[] args) {

		GenericMethodExample example = new GenericMethodExample();
		example.print(123);
		example.print("Java Alien");
		example.print(47.40);

	}
}
