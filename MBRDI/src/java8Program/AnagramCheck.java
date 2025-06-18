package java8Program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
public static void main(String[] args) {
	String str1 = "listen";
    String str2 = "silent";
   
    
   boolean anagrams= Arrays.equals(
     str1.chars()
         .sorted()
        .toArray(), str1.chars()
                        .sorted()
                        .toArray());
   
   System.out.println(anagrams);
}
}
