package downcasting;

// Java program to demonstraten Upcasting Vs Downcasting

// Parent class
class Parent1 {
    String name;

    // A method which prints the signature of the parent class
    void method() {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child1 extends Parent1 {
    int id;

    // Overriding the parent method to print the signature of the child class
    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

// UpcastingVsDowncasting class to see the difference between upcasting and downcasting
public class UpcastingVsDowncasting {

    // Driver code
    public static void main(String[] args) {
        // Upcasting
        Parent1 p = new Child1();
        p.name = "GeeksforGeeks";

        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overridden method hence this will be executed
        p.method();

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        Child1 c = (Child1) p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}

