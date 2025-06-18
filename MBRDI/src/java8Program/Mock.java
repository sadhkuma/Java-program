package java8Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*write java8 program for the below and execute?
Input: nums = [1,2,3,1]
Output: true
Input: nums = [5,6,3,4]
Output: false*/
public class Mock {


	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 6, 3, 4);
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 1);
		System.out.println("" + check(nums));
		System.out.println("" + check(nums1));

	}

	public static Boolean check(List<Integer> number) {
		Set<Integer> set1 = new HashSet<>();
		return number.stream().anyMatch(n -> !set1.add(n));
	}
}
