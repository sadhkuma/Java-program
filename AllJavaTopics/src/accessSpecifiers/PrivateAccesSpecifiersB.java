package accessSpecifiers;

public class PrivateAccesSpecifiersB {
    public static void main(String[] args) {


        PrivateAccesSpecifiers obj = new PrivateAccesSpecifiers();
        // obj.a; //private can't be acces outside thn class
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
