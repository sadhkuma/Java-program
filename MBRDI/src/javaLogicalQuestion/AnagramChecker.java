package javaLogicalQuestion;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        // Count character frequencies using streams
        var freq1 = s1.chars()
                      .mapToObj(c -> (char) c)
                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        var freq2 = s2.chars()
                      .mapToObj(c -> (char) c)
                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return freq1.equals(freq2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
