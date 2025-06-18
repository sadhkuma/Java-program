package java8Program;

import java.util.*;

public class SortStringsUsingComparator {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

		// Sorting strings by their length using a custom Comparator
		words.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())); // Sort by length of strings

		// Printing the sorted list
		System.out.println("Sorted list by string length: " + words);
	}
}
