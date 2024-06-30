package com.alien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1010, "Rajeev", 10000.00, LocalDate.of(2021, 7, 10)));
		employees.add(new Employee(1004, "Chris", 9500.50, LocalDate.of(2023, 3, 19)));
		employees.add(new Employee(1015, "Chetan", 13400.00, LocalDate.of(2022, 9, 28)));
		employees.add(new Employee(1018, "Kavya", 17600.00, LocalDate.of(2022, 5, 20)));
		employees.add(new Employee(1009, "Akshu", 7600.00, LocalDate.of(2018, 9, 12)));

		System.out.println("Employees (Before Sorting) : ");
		employees.stream().forEach(emp -> System.out.println(emp));
		// This will use the `compareTo()` method of the `Employee` class to compare two
		// employees and sort them.
		Collections.sort(employees);

		System.out.println("\nEmployees (After Sorting) : ");

		employees.stream().forEach(emp -> System.out.println(emp));
	}

}
