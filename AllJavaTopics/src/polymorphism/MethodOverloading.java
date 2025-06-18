package polymorphism;

public class MethodOverloading {

    void show(int a){
        System.out.println("int method called");
        System.out.println(a);//due to type promomtion
    }

    void show(String a){
        System.out.println("String method called");
        System.out.println(a);
    }

    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();
        obj.show('a');
        obj.show("a");

    }

}
