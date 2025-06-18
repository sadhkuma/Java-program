package Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {
	public static void main(String[] args) {
		
		// Find the longest string in a list of strings using Java streams:
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "apple", "grapefruit");
		Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));
		System.out.println(max.get());

		// remove duplicate
		Set<String> uniqueList = strings.stream().collect(Collectors.toSet());
		System.out.println(uniqueList);
		
		//Remove duplicates from a list while preserving the order using Java streams:
		//or using distinct method
		
		List<String> uniqueList1 = strings.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);
		

		// Calculate the average age of a list of Person objects using Java streams:

		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));
		double avgAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
		System.out.println(avgAge);

		// Merge two sorted lists into a single sorted list using Java streams:

		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8,7, 10);
		List<Integer> concatedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(concatedList);

		// Find the intersection of two lists using Java streams:

		List<Integer> finalList = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(finalList);
		
		
		

	}
}
