package exceptions;
//1. Write a Java program that throws an exception and catch it using a try-catch block.
public class JavaExceptionExample{
    public static void main(String args[]){
        try{
            //code that may raise exception
            int data=100/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}
