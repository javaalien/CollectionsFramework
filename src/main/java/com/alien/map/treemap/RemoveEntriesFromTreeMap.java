package com.alien.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class RemoveEntriesFromTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> countryISOCodeMapping = new TreeMap<>();

		countryISOCodeMapping.put("India", "IN");
		countryISOCodeMapping.put("United States of America", "US");
		countryISOCodeMapping.put("China", "CN");
		countryISOCodeMapping.put("United Kingdom", "UK");
		countryISOCodeMapping.put("Russia", "RU");
		countryISOCodeMapping.put("Japan", "JP");

		System.out.println("CountryISOCodeMapping : " + countryISOCodeMapping);

		String countryName = "Japan";
		String isoCode = countryISOCodeMapping.remove(countryName);
		if (isoCode != null) {
			System.out.println("Removed (" + countryName + " => " + isoCode + ") from the TreeMap. New TreeMap "
					+ countryISOCodeMapping);
		} else {
			System.out.println(countryName + " does not exist, or it is mapped to a null value");
		}

		countryName = "India";
		boolean isRemoved = countryISOCodeMapping.remove(countryName, "IA");
		System.out.println("Was the mapping removed for " + countryName + "? : " + isRemoved);

		Map.Entry<String, String> firstEntry = countryISOCodeMapping.pollFirstEntry();
		System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + countryISOCodeMapping);

		Map.Entry<String, String> lastEntry = countryISOCodeMapping.pollLastEntry();
		System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + countryISOCodeMapping);

	}
}
