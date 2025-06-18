package string;

//public class Reverse_Sentance {
//
//    public static void main(String[] args) {
//        String s = " i love programming very much";
//        String sArra[] = s.split(" ");
//        String rev = "";
//        for (int i = sArra.length - 1; i >= 0; i--) {
//            rev += sArra[i] + " ";
//        }
//        System.out.println(rev);
//    }
//}

import java.util.*;
class Reverse_Sentance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        //Breaking the sentence into words
        String s[] = str.split(" ");
        System.out.println(s[0]);

        //Adding the words stored in the array to the last
        for(int j=0;j<s.length;j++){
            rev = s[j]+" "+rev;
        }

        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);
    }
}

