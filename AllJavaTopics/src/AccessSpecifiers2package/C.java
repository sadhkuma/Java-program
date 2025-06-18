package AccessSpecifiers2package;

import accessSpecifiers.PrivateAccesSpecifiers;

public class C extends PrivateAccesSpecifiers {
    public static void main(String[] args) {
        PrivateAccesSpecifiers obj=new PrivateAccesSpecifiers();
        System.out.println(obj.d);

        C obj1=new C();
        System.out.println(obj1.c);
        System.out.println(obj1.d);
    }
}
