package com.alien.map.hashmap;

import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Doctor {

	private Integer id;
	private String name;
	private int age;

	public Doctor() {
		super();
	}

	public Doctor(Integer id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class CustomKeyObjectHashMap {

	public static void main(String[] args) {

		HashMap<Doctor, String> map = new HashMap<>();

		map.put(new Doctor(4, "Chetan", 30), "Ankura");
		map.put(new Doctor(1, "Akshu", 25), "Sahara");
		map.put(new Doctor(2, "Kavya", 5), "Alien");
		map.put(new Doctor(3, "Rudra", 20), "Apple");

		LinkedHashMap<Doctor, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (d1, d2) -> d1, LinkedHashMap::new));

		System.out.println(collect);
	}
}
