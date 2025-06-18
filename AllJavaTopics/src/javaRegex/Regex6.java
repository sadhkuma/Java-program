package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String input="123409op78";
       // Pattern p=Pattern.compile("\\d");   \\d represnts digits
        Pattern p=Pattern.compile("[0-9]");
        Matcher m= p.matcher(input);

        while ( m.find()){
            System.out.println(input.substring(m.start(),m.end()));
        }
    }
}
