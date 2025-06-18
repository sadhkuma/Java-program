package java8Program;

import java.util.*;
import java.util.stream.Stream;

public class Concatenate_two_Streams {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

		// Concatenated the list1 and list2 by converting them into Stream
		concatStream.forEach(str -> System.out.print(str + " "));

		// Using flatMap()
		System.out.println("=============");
		Stream<String> combined = Stream.of(list1, list2).flatMap(Collection::stream);
		combined.forEach(str -> System.out.print(str + " "));

	}
}
