package strictfpKeyword;

public class ThirdProg {
    float f = 9.381f;
    strictfp public void displayValue(){
        System.out.println(f);
    }
    public static void main(String[] args) {
        ThirdProg Demo = new ThirdProg ();
        Demo.displayValue();
    }
}
