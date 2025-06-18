package string;
import java.util.Scanner;

public class CompareToMethod {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int totalLength=A.length()+B.length();
        System.out.println(totalLength);

        int compare=A.compareTo(B);
        if(compare>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");

        }

        String capitalizedWord = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedWord2 = B.substring(0, 1).toUpperCase() + B.substring(1);


        System.out.print(capitalizedWord + " "+ capitalizedWord2);
    }
}



