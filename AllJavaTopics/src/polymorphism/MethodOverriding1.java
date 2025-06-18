package polymorphism;


class Sup{
    int x=10;
    void disp(){
        System.out.println("Super:+x");
    }
}

class Sub extends  Sup{
    int y=20;
    void disp(){
        System.out.println("Super:"+(x+y));
        System.out.println("Sub:"+y);
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {
         Sub obj=new Sub();
         obj.disp();
    }
}
