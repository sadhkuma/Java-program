package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*Q10) Given a list of integers, sort all the values present in 
 * Fit in descending order using Stream functions?*/
public class Decending_order {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12, 34, 2, 5, 6);

		// using lambda expression
		List<Integer> collect = asList.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println(collect);

		// 2nd ways

		System.out.println("------using compareTo()-----");
		// using compareTo()
		
		List<Integer> collect2 = asList.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("-----------------");
		asList.sort((a, b) -> Integer.compare(b, a));
		System.out.println(asList);

		// Reversing the list using Collections.reverse()
		System.out.println("------Collections.reverse()-----");
		List<Integer> reversedList = asList.stream().collect(Collectors.toList()); // Collect stream into a list
		Collections.reverse(reversedList); // Reverse the list in-place

		// Printing the reversed list
		System.out.println("Reversed list: " + reversedList);

		asList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}
}
