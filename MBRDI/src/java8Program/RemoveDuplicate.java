package java8Program;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*"cbacdcbc" remove the duplicates using stream api?*/
public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "cbacdcbc";
		String result = input.chars() // Convert the string to an IntStream
				.mapToObj(c -> (char) c) // Convert each int to a Character
				.distinct() // Remove duplicates
				.map(String::valueOf) // Convert each Character back to String
				.collect(Collectors.joining()); // Join them back into a single string

		System.out.println("String after removing duplicates: " + result);
	}
}
