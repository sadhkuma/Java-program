package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Q14)Find the Word/number got repeated by using Stream api
 
   input:2,3,34,,5,5,4,3,3,3
 
   output:2-1,3-4,34-1,5-2,4-1*/

public class Count_repeated_Number {
public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(2,3,3,4,5,5,4,3,3,3);
	Map<Integer,Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
}
}
