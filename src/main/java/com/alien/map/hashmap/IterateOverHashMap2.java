package com.alien.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class IterateOverHashMap2 {

	public static void main(String[] args) {

		Map<String, Double> employeeSalary = new HashMap<>();
		employeeSalary.put("David", 76000.00);
		employeeSalary.put("John", 120000.00);
		employeeSalary.put("Mark", 95000.00);
		employeeSalary.put("Steven", 134000.00);

		System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
		employeeSalary.forEach((employee, salary) -> {
			System.out.println(employee + "=>" + salary);
		});

		System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
		employeeSalary.entrySet().forEach((entry) -> {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		});

		System.out.println("\n=== Iterating over the HashMap's keySet ===");

		employeeSalary.keySet().forEach((employee) -> {
			System.out.println(employee + "=>" + employeeSalary.get(employee));
		});

		System.out.println("\n=== Iterating over the HashMap's values ===");

		employeeSalary.values().forEach((val) -> {
			System.out.println(val);
		});

		System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");

		Set<Map.Entry<String, Double>> entrySet = employeeSalary.entrySet();

		Iterator<Map.Entry<String, Double>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Double> entry = iterator.next();
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
		
		

	}

}