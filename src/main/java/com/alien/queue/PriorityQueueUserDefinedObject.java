package com.alien.queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueUserDefinedObject {

	public static void main(String[] args) {

		PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

		employeePriorityQueue.add(new Employee("Chetan", 100000.00));
		employeePriorityQueue.add(new Employee("Chris", 145000.00));
		employeePriorityQueue.add(new Employee("Andrea", 115000.00));
		employeePriorityQueue.add(new Employee("Jack", 167000.00));

		while (!employeePriorityQueue.isEmpty()) {
			System.out.println(employeePriorityQueue.remove());
		}
	}
}

class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
	}

	// Compare two employee objects by their salary
	@Override
	public int compareTo(Employee employee) {
		if (this.getSalary() > employee.getSalary()) {
			return 1;
		} else if (this.getSalary() < employee.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}
}
