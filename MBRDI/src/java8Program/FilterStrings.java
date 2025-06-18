package java8Program;

import java.util.List;

/*Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters
abc
ABCD
ABC*/
import java.util.*;
import java.util.stream.*;

public class FilterStrings {
	public static List<String> filterList(List<String> input) {
		return input.stream().filter(str -> str.length() == 3 && str.startsWith("a")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("abc", "ABCD", "ABC", "axy", "ab", "a12");

		List<String> result = filterList(input);

		System.out.println("Filtered Strings: " + result); // Output: [abc, axy, a12]
	}
}
