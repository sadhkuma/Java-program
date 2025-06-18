package java8Program;

import java.util.Arrays;
import java.util.List;

//Q5) Given a list of integers, find the total number of elements present 
//in the list using Stream functions?
public class Count_numberOfelment {
public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(1,2,3,3,2,0);
	long count = asList.stream().count();
	System.out.println(count);
}
}
