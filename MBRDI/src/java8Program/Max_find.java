package java8Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*Q6) Given a list of integers, find the maximum value element
 *  present in it using Stream functions? */
public class Max_find {
	public static void main(String[] args) {
		Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The Maximum number is: " + max);

		// 2nd waay
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int max1 = myList.stream().max(Integer::compare).get();
		System.out.println(max1);

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> longestString = strings.stream().max(Comparator.comparingInt(String::length));
		System.out.println(longestString.get());

	}
}
