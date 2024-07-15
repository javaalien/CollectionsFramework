package com.alien.set.treeset;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUserDefinedObject {

	public static void main(String[] args) {

		SortedSet<Employee> employees = new TreeSet<>();

		employees.add(new Employee(1010, "Rajeev"));
		employees.add(new Employee(1005, "Sachin"));
		employees.add(new Employee(1008, "Chris"));
		employees.add(new Employee(1007, "Chetan"));
		employees.add(new Employee(1003, "Kavya"));

		System.out.println("Employees (sorted based on Employee class's compareTo() function)");
		System.out.println(employees);

		employees = new TreeSet<>(Comparator.comparing(Employee::getName));

		employees.add(new Employee(1010, "Rajeev"));
		employees.add(new Employee(1005, "Sachin"));
		employees.add(new Employee(1008, "Chris"));
		employees.add(new Employee(1007, "Chetan"));
		employees.add(new Employee(1003, "Kavya"));

		System.out.println("\nEmployees (sorted based on the supplied Comparator)");
		System.out.println(employees);

	}
}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Two Employees are equal if their IDs are equal
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return id == employee.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Compare employees based on their IDs
	@Override
	public int compareTo(Employee employee) {
		return this.getId() - employee.getId();
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}