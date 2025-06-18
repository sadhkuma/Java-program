package java8Program;

import java.util.List;
import java.util.stream.Collectors;

/*Q2) Given a list of integers, find out all the numbers starting with 1 
 * using Stream functions? list=[1,200,11,100]*/
public class Starts_WithOneNumberFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=List.of(1,200,11,100);
		List<String> newList=number.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(newList);

	}

}
