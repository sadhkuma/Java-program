package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Q9) Given a list of integers, sort all the values present in it using Stream functions?*/
public class Sort_element {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		myList.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------------");
		
		List<Integer> collect = myList.stream().sorted((a,b)->a-b).collect(Collectors.toList());
		System.out.println(collect);
	}
}
