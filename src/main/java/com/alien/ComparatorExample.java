package com.alien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1010, "Rajeev", 10000.00, LocalDate.of(2021, 7, 10)));
		employees.add(new Employee(1004, "Waseem", 9500.50, LocalDate.of(2023, 3, 19)));
		employees.add(new Employee(1015, "Chetan", 13400.00, LocalDate.of(2022, 9, 28)));
		employees.add(new Employee(1018, "Kavya", 17600.00, LocalDate.of(2022, 5, 20)));

		System.out.println("======================================================================");
		System.out.println("Before Sorting Employees : ");

		employees.stream().forEach(emp -> System.out.println(emp));

		// Sort employees by Name
		System.out.println("======================================================================");
		System.out.println("Sort employees by Name : ");
		Collections.sort(employees, Comparator.comparing(Employee::getName));
		employees.stream().forEach(emp -> System.out.println(emp));

		System.out.println("======================================================================");
		System.out.println("Sort employees by Salary : ");
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
		employees.stream().forEach(emp -> System.out.println(emp));

		System.out.println("======================================================================");
		System.out.println("Sort employees by JoiningDate : ");
		Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
		employees.stream().forEach(emp -> System.out.println(emp));

		System.out.println("======================================================================");
		System.out.println("Sort employees by Name in descending order : ");
		Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
		employees.stream().forEach(emp -> System.out.println(emp));

		System.out.println("======================================================================");
		System.out.println("Chaining multiple Comparators : ");
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
		employees.stream().forEach(emp -> System.out.println(emp));

	}
}
