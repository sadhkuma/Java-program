package scannnerClass;

//program of using useDelimeter: It is used to set the delimiting pattern of the Scanner which is in use to the specified pattern.

import java.util.*;
public class Program4 {
    public static void main(String args[]){

        String str = "Hello/This is Java Program/My name is Sadhna.";

        //Create scanner with the specified String Object
        Scanner scanner = new Scanner(str);
        System.out.println("Boolean Result: "+scanner.hasNextBoolean());

        //Change the delimiter of this scanner
        scanner.useDelimiter("/");

        //Printing the tokenized Strings
        System.out.println("---Tokenizes String---");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        //Display the new delimiter
        System.out.println("Delimiter used: " +scanner.delimiter());
        scanner.close();
    }
}
