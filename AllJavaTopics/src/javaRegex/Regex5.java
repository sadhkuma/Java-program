package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5
{
    public static void main(String[] args) {
        String input="WelcomeA WelcomeB WelcomeC";
        Pattern p=Pattern.compile("Welcome.");
        Matcher m= p.matcher(input);

        while ( m.find()){
            System.out.println(input.substring(m.start(),m.end()));
        }
    }
}
