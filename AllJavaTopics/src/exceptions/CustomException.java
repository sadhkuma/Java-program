package exceptions;

import java.util.Scanner;


class NotEligibleForVoting extends Exception {
    public NotEligibleForVoting() {
        super("your age is below 18.hence not eligible");
    }

    public NotEligibleForVoting(String msg) {
        super(msg);

    }
}

    public class CustomException {
        public static void main(String[] args) {
            System.out.println("welcome to our voting Booth");
            System.out.println("Please enter your age");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();

            System.out.println("Your age is" + age);
            try {
                if (age < 18) {
                    throw new NotEligibleForVoting("you cant vote");
                } else {
                    System.out.println("you can vote!!");
                }
            } catch (NotEligibleForVoting e) {
                e.printStackTrace();
            }
        }
    }

