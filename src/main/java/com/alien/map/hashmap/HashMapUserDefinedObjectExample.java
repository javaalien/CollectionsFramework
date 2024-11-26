package com.alien.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedObjectExample {

	public static void main(String[] args) {
		Map<Integer, Employee1> employeesMap = new HashMap<>();
		employeesMap.put(1001, new Employee1(1001, "Ramesh", "Bengaluru"));
		employeesMap.put(1002, new Employee1(1002, "John", "New York"));
		employeesMap.put(1003, new Employee1(1003, "Jack", "Paris"));

		System.out.println(employeesMap);
	}
}

class Employee1 {
	private Integer id;
	private String name;
	private String city;

	public Employee1(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", city='" + city + '\'' + '}';
	}
}
