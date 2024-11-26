package com.alien.set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IterateOverLinkedHashSetExample {

	public static void main(String[] args) {

		Set<String> programmingLanguages = new LinkedHashSet<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("Ruby");

		System.out.println("=== Iterate over a LinkedHashSet using Java 8 forEach and lambda ===");
		programmingLanguages.forEach(programmingLanguage -> {
			System.out.println(programmingLanguage);
		});

		System.out.println("=== Iterate over a LinkedHashSet using simple for-each loop ===");

		for (String programmingLanguage : programmingLanguages) {
			System.out.println(programmingLanguage);
		}

		System.out.println("=== Iterate over a LinkedHashSet using iterator() ===");

		Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();

		while (programmingLanguageIterator.hasNext()) {
			String programmingLanguage = programmingLanguageIterator.next();
			System.out.println(programmingLanguage);

		}

		System.out
				.println("=== Iterate over a LinkedHashSet using iterator() and Java 8 forEachRemaining() method ===");
		programmingLanguageIterator = programmingLanguages.iterator();

		programmingLanguageIterator.forEachRemaining(programmingLanguage -> {
			System.out.println(programmingLanguage);
		});
	}
}
