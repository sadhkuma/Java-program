package java8Program;

//18)Given a list of Integer find square of all distinct numbers By using stream api
import java.util.*;
import java.util.stream.Collectors;

public class Square_All_distinct_numbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> collect = numbers.stream().distinct().map(n -> n * n).collect(Collectors.toList());
		System.out.println(collect);
	}
}
