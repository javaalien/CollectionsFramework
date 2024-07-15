package com.alien.list.arraylist;

import java.util.ArrayList;

//  Java Program to Handle ArrayList of Objects

public class ArrayListOfObjects {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		// Step 3: Populating the ArrayList with Employee objects
		employees.add(new Employee("John Doe", 30));
		employees.add(new Employee("Jane Doe", 25));
		employees.add(new Employee("Steve Smith", 28));

		System.out.println("Employees list:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		employees.remove(1); // Removing Jane Doe
		System.out.println("\nEmployees list after removal:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + '}';
	}
}