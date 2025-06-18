public class MultipleObjectsByOneTypeOnly {

    void disp(){
        System.out.println("Welcome to  Bangalore");
    }

    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;}
    void calculateArea(){System.out.println("Area is :"+length*width);}
    public static void main(String args[]) {
        MultipleObjectsByOneTypeOnly r1 = new MultipleObjectsByOneTypeOnly(), r2 = new MultipleObjectsByOneTypeOnly();//creating two objects
        r1.disp();
        r2.insert(3,15);
        r2.calculateArea();
    }
}
