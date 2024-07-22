package com.alien.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java Program to Convert a List of String to Comma Separated String

public class ConvertListCommaSeparatedString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Java", "Aliens", "JavaAliens"));

		String str = String.join(",", list);

		System.out.println(str);

	}
}
