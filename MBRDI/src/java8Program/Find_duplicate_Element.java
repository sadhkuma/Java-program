package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Q3)Print duplicate elements in a given integers list
 *  in java using Stream functions? list [1,2,3,3,2,0]*/
public class Find_duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3,3,2,0);
		Set<Integer> collect = l.stream().collect(Collectors.toSet());
		System.out.println(collect);
	

	}

}
