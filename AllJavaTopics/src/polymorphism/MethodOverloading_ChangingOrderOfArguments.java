package polymorphism;

class PrintValues {
    public void print(int val1, char val2) {
        System.out.println("The int value is: " + val1);
        System.out.println("The char value is: " + val2);
    }
    public void print(char val1, int val2) {
        System.out.println("The char value is: " + val1);
        System.out.println("The int value is: " + val2);
    }
}
public class MethodOverloading_ChangingOrderOfArguments {

        public static void main(String[] args) {
            PrintValues obj = new PrintValues();
            obj.print(15, 'A');
            obj.print('P', 4);
        }
}
