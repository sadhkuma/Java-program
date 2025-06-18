package inheritance;
public class WithoutSuper
    {
        int x = 20;
        void display()
        {
            System.out.println("X = " +x);
        }
    }
     class A extends WithoutSuper
    {
        int x = 50;
        void display()
        {
            System.out.println("X = " +x);
        }
    }
     class C {
        public static void main(String[] args)
        {
            // Creating an instance of subclass.
            A n = new A();
            n.display();// it will call subclass method only , if we want to call superclass method then use Super Keyword
        }
    }

