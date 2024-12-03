package com.alien.generics;

public class GenericMethodExample2 {

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "Generics", "in", "Java"};
        
        printArray(intArray);
        printArray(strArray);

	}
}
