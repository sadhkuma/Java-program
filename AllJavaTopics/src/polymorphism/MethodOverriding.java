package polymorphism;


class  A{
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }

    void show(){
        System.out.println("i and j:"+i+" "+j);
    }
}

class B extends A{
    int k;
    B(int a,int b,int c){
    super(a,b);
        k=c+a+b;
    }
    void show(){

        System.out.println("k:"+k);
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj=new B(1,2,5);
        obj.show();
    }
}
