
/*When type of the object is determined at compiled time(by the compiler), it is known as
static binding/Early Binding.
If there is any private, final or static method in a class, there is static binding.*/

package binding;
// Main class
class StaticBinding {

    // Static nested inner class Class 1
    public static class superclass {

        // Method of inner class
        static void print()
        {
            System.out.println("print() in superclass is called");
        }
    }

    // Static nested inner class Class 2
    public static class subclass extends superclass {

        // Method of inner class
        static void print()
        {


            System.out.println("print() in subclass is called");
        }
    }

    public static void main(String[] args)
    {

        // Creating objects of static inner classes inside main() method
        superclass A = new superclass();
        superclass B = new subclass();

        // Calling method over above objects
        A.print();
        B.print();
    }
}

