package polymorphism;

public class MethodOverloading_ChangingNoOfArguments {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(MethodOverloading_ChangingNoOfArguments.add(11, 11));
        System.out.println(MethodOverloading_ChangingNoOfArguments.add(11, 11, 11));
    }
}
