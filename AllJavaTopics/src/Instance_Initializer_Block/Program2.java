package Instance_Initializer_Block;

public class Program2 {

    int speed;

    Program2()
    {
        System.out.println("constructor is invoked");
    }

    //Initializer block
    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String args[]){
        Program2 b1=new Program2();
        Program2 b2=new Program2();
    }
}
