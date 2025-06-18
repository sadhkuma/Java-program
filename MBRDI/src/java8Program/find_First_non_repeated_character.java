package java8Program;

/*Q7) Given a String, find the first non-repeated character in it 
 * using Stream functions? [A,A,B,C,D,D,E]*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class find_First_non_repeated_character {
	public static void main(String[] args) {
		String input = "AABCDDE";

		Character s = input.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
				.findFirst().orElse(null);
		System.out.println(s);
		
	}
}
