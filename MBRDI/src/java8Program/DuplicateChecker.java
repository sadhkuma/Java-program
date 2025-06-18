package java8Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*write java8 program for the below and execute?
Input: nums = [1,2,3,1]
Output: true
 
Input: nums = [5,6,3,4]
Output: false*/
public class DuplicateChecker {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 6, 3, 4);
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 1);
		System.out.println("" + haDup(nums));
		System.out.println("" + haDup(nums1));

	}

	private static Boolean haDup(List<Integer> nums) {
		Set<Integer> set1 = new HashSet<>();
		return nums.stream().anyMatch(n -> !set1.add(n));
	}
}
