package covarient_Return_Type;

 class X
{
    public Object m1()
    {
        System.out.println("Hello, this is a superclass");
        return null;
    }
}
  class Y extends X
{
    @Override
    public String m1()
    {
        System.out.println("Hello, this is the subclass");
        return null;
    }
}
public class Covariant3 {
    public static void main(String[] args)
    {
        Y b = new Y();
        b.m1();

        X a = new Y();
        a.m1();
    }
}

