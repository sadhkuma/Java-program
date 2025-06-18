package java8Program;

/*Q12 ) Write a Java 8 program to find the number of Strings in a list whose length is greater
than 5?*/
import java.util.*;

public class CountStringsByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "kiwi");

		// Counting the number of strings whose length is greater than the specified
		// length
		long count = words.stream().filter(word -> word.length() > 5).count(); // Count the number of matching words

		// Printing the result
		System.out.println("Number of strings with length greater than:  " + count);

	}
}
