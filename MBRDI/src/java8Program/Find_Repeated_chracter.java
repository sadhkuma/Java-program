package java8Program;

import java.util.HashSet;
import java.util.Set;

/*Q8) Given a String, find the first repeated character in it using Stream functions? [A,A,B,C,D,D,E]*/
public class Find_Repeated_chracter {
	public static void main(String args[]) {
		String input = "Java Hungry Blog Alive is Awesome";

		Set<Character> seenCharacters = new HashSet<>();
		Character s = input.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst()
				.orElse(null);
		System.out.println(s);
	}
}
