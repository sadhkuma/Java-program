package inheritance;

public class ThisAndSuper {
    protected  int f=1;
}

  class  B extends  ThisAndSuper {
    protected  int f=3;
    public  B()
    {
        System.out.println(this.f);
        System.out.println(super.f);
    }

    public static void main(String[] args) {
      new B();
    }
}
