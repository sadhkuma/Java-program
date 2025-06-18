package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("bye");
        Matcher m = p.matcher("bye");

        if (m.matches()) {
            System.out.println("pattern matched successfully!");
        } else {
            System.out.println("Invalid input");
        }
    }
}
