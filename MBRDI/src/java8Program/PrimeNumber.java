package java8Program;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		if (number == 2)
			return false;
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 6, 8, 9, 10, 13, 15);
		boolean containsPrime = numbers.stream().anyMatch(PrimeNumber::isPrime);
		System.out.println("List contains a prime number: " + containsPrime);
	}
}
