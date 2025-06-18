package string;
import java.io.*;
        import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String str = "";
        /* Enter your code here. Print output to STDOUT. */
        //madam
        System.out.println("original string is: " + A);
        for (int i = A.length() - 1; i >= 0; i--) {
            //System.out.print((A.charAt(i)));
            str = str + A.charAt(i);
        }
        System.out.println("reversed string is: "+str);
        if (A.toLowerCase().equals(str.toLowerCase())) {
            System.out.println(A + " is a Palindrome String.");
        }
        else {
            System.out.println(A + " is not a Palindrome String.");
        }
    }
}



