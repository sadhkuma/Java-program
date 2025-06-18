package polymorphism;

public class MethodOverloadingWithTypePromotion {

    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}

    public static void main(String args[]){
        MethodOverloadingWithTypePromotion obj=new MethodOverloadingWithTypePromotion();
        obj.sum(20,20);//now int arg sum() method gets invoked
    }
}
