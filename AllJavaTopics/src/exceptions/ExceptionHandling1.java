package exceptions;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ExceptionHandling1 {

    public static void main(String[] args) {

        /*You will be given two integers x and  y as input, you have to compute .
         If  x and y are not  bit signed integers or if y is zero, exception will occur and you have to report it.
        Read sample Input/Output to know what to report in case of exceptions.*/

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}