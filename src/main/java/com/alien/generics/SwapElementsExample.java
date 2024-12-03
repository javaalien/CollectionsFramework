package com.alien.generics;

public class SwapElementsExample {

	public static <T> void swap(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };

		swap(intArray, 0, 4);

		for (Integer i : intArray) {
			System.out.print(i + " ");
		}

		System.out.println();

		String[] strArray = { "A", "B", "C", "D" };
		swap(strArray, 1, 3);
		for (String s : strArray) {
			System.out.print(s + " ");
		}
	}
}
