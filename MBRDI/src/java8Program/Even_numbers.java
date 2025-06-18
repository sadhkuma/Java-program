package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q1) Given a list of integers, find out all the even numbers exist in the list
 *  using Stream functions? list=[2,34,678,3]*/

public class Even_numbers {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 34, 678, 3);
		List<Integer> evenNum = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNum);
	}

}
