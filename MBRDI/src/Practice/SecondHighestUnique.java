package Practice;

import java.util.Arrays;
import java.util.List;

//Find the Second Largest Unique Number - 4,1,6,2,5,9,1
public class SecondHighestUnique {
	public static void main(String[] args) {
		
	
	List<Integer> list=Arrays.asList(4,1,6,2,5,9,1 );
	
	Integer secondLargest = list.stream()
            .distinct() 
            .sorted((a, b) -> b - a) 
            .skip(1) 
            .findFirst()
            .orElse(null);
	
	System.out.println(secondLargest);
}
}