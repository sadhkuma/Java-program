package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		//using for-each
		myList.stream().sorted().forEach(System.out::println);
		List<Integer >sortedList=myList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}
}
