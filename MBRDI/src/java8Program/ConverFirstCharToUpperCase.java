package java8Program;

import java.util.*;
import java.util.stream.Collectors;

/*List<String> strings = Arrays.asList("hello", "world", "java", "stream", "a");*/
public class ConverFirstCharToUpperCase {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("hello", "world", "java", "stream", "a");
		List<String> collect = strings.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
