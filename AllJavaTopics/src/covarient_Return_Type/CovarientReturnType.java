
class A{
    A show(){
        System.out.println("welcome to  Super class method ");
        return  this;
    }
}

class  B extends A{
    B show(){
        System.out.println("welcome to covariant return type");
        return  this;
    }
}
public class CovarientReturnType {
    public static void main(String[] args) {
        B b =new  B();
        b.show();
    }
}
