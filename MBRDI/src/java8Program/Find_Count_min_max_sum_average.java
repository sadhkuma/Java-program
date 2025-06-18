package java8Program;
import java.util.*;
import java.util.IntSummaryStatistics;

//19)Given a List of Integers find total count, min, max, sum, 
//and the average for numbers by using Stream api

public class Find_Count_min_max_sum_average {

	public static void main(String[] args) {

		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics status = primes.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(status);
	}

}
