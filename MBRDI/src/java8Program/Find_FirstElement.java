package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Q4) Given the list of integers, find the first element of the list using Stream functions?
public class Find_FirstElement {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,3,2,0);
		//int findFirst2 = asList.stream().findFirst().get();
		//System.out.println(findFirst2);
		Optional<Integer> findFirst = asList.stream().findFirst();
		System.out.println(findFirst);
	}

}
