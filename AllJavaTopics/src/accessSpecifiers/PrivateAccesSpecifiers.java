package accessSpecifiers;

public class PrivateAccesSpecifiers
{
    private  int a=10;
            int b=20;
    protected  int c=30;
    public  int d=40;

    public static void main(String[] args) {
        PrivateAccesSpecifiers obj=new PrivateAccesSpecifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }

}
