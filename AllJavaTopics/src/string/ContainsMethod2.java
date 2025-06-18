package string;
//The contains() method raises the NullPointerException when one passes null in the parameter of the method.
public class ContainsMethod2 {
    public static void main(String argvs[])
    {
        String str = "Welcome to JavaTpoint!";

// comparing a string to null


        if(str.contains(null))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }

    }
}
