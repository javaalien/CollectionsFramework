package com.alien.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSimpleOperations {

	public static void main(String[] args) {
		Set<String> popularCities = new LinkedHashSet<>();

		popularCities.add("London");
		popularCities.add("New York");
		popularCities.add("Paris");
		popularCities.add("Dubai");

		String cityName = "Paris";

		if (popularCities.contains(cityName)) {
			System.out.println(cityName + " is in the popular cities set.");
		} else {
			System.out.println(cityName + " is not in the popular cities set.");
		}

	}

}
