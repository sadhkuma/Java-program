package final_Kyeword;

//static blank final variable:-A static final variable that is not initialized at
// the time of declaration is known as static blank final variable.
// It can be initialized only in static block.
public class Static_Blank_Final_Variable {
    static final int data;//static blank final variable

    //for initialization, we use Static block
    static
    {
        data=50;
    }

    public static void main(String args[]){
        System.out.println(Static_Blank_Final_Variable.data);
    }
}
