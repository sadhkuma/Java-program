package Instance_Initializer_Block;


class Sup{
    Sup(){
        System.out.println("parent class constructor invoked");
    }
}

class Program4 extends Sup{
    Program4(){
        super();
        System.out.println("child class constructor invoked");
    }

    //parameterized constructor
    Program4(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        Program4 b1=new Program4();
        Program4 b2=new Program4(10);
    }
}
