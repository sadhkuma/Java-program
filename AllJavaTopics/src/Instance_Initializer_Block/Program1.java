package Instance_Initializer_Block;

public class Program1 {

    int speed;

    Program1(){System.out.println("speed is: "+speed);}

    {speed=100;}

    public static void main(String args[]){
        Program1 b1=new Program1();
        Program1 b2=new Program1();
    }
}
