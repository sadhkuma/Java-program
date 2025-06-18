package java8Program;

//count the number of elements in  the 2 partitions 
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionBy_Example2 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Using Collectors.counting() method 
// to count the number of elements in 
// the 2 partitions 
		Map<Boolean, Long> map = s.collect(Collectors.partitioningBy(num -> (num > 3), Collectors.counting()));


		System.out.println("Elements in stream " + "partitioned by " + "less than equal to 3: \n" + map);
	}
}
