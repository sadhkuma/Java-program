package strictfpKeyword;

// Java program to illustrate strictfp modifier
// Usage in Classes

// Main class
class SecondProg {

    // Method 1 Calculating sum using strictfp modifier
    public strictfp double sum()
    {

        double num1 = 10e+10;
        double num2 = 6e+08;

        // Returning the sum
        return (num1 + num2);
    }

    public static void main(String[] args)
    {

        // Creating object of class SecondProg
        SecondProg s = new SecondProg();
        System.out.println(s.sum());
    }
}

