package java8Program;

//17)Convert String to uppercase and Join them with comma
import java.util.*;
import java.util.stream.Collectors;

public class String_Conver_To_Uppercase {
	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String collect = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(collect);
	}
}
