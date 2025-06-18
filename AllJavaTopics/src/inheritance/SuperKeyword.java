package inheritance;

public class SuperKeyword {
        int x = 20;
        void display()
        {
            System.out.println("X = " +x);
        }
    }
    class Number extends SuperKeyword
    {
        int x = 50;
        void display()
        {
            System.out.println("X = " +super.x); // Accessing superclass instance variable using super keyword.
            System.out.println("X = " +x);
        }
    }
    class NumberTest {
        public static void main(String[] args)
        {
            Number n = new Number();
            n.display();
        }
    }

