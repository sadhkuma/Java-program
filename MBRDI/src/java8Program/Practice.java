package java8Program;

import java.util.Arrays;import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {
public static void main(String[] args) {
	//Q1) Given a list of integers, find out all the even numbers exist in
		//the list using Stream functions? list=[2,34,678,3]
		List<Integer> asList = Arrays.asList(2,34,678,3);
		List<Integer> evenNo = asList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even  number is :" +evenNo);
		
		//Q2) Given a list of integers, find out all the numbers 
		//starting with 1 using Stream functions? list=[1,200,11,100]
		
		List<Integer> list = Arrays.asList(1,200,11,100);
		List<String> collect = list.stream().map(s->s +"").filter(str->str.startsWith("1")).collect(Collectors.toList());
		System.out.println(collect);
		
		//2nd way
		list.stream().filter(s->s.toString().startsWith("1")).forEach(i->System.out.println(i));
		
		//Q3)Print duplicate elements in a given integers list in java using Stream functions? list [1,2,3,3,2,0]
		List<Integer> list1 = Arrays.asList(1,2,3,3,2,0);
		list1.stream().distinct().forEach(System.out::println);
		
		//Q4) Given the list of integers, find the first element of the list using Stream functions?
		System.out.println("_______________________________");
		Optional<Integer> findFirst = list1.stream().findFirst();
		System.out.println(findFirst.get());
		
		System.out.println("_____________Max element__________________");
		//Q6) Given a list of integers, find the maximum value element present in it using Stream functions? 
		 Integer integer = list1.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
		 System.out.println("max is :"+integer);
		 Integer integer2 = list1.stream().min(Integer::compare).get();
		 System.out.println("min is :"+integer2);
		 
		 //Q9) Given a list of integers, sort all the values present in it using Stream functions?
		 List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		 System.out.println("Sorted element is :"+ sortedList);
		 
		 //sort all the values present in it in descending order using Stream functions?
		 List<Integer> descendendingList = list1.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		 System.out.println("descendending List is :"+descendendingList);
		 
		 //Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
		 List<String> strings = Arrays.asList("apple", "banana", "orange", "watermelon", "grapefruit");
		 long count = strings.stream().filter(s->s.length()>5).count();
		 System.out.println("the number of Strings in a list whose length is greater than 5 :"+ count);
		
}
	
}
