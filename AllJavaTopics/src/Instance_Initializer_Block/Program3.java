package Instance_Initializer_Block;

 class A {

    A(){
        System.out.println("parent class constructor invoked");
    }
}
class Program3 extends A{
    Program3(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        Program3 b=new Program3();
    }
}
