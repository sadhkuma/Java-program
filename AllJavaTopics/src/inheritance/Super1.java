package inheritance;

public class Super1 {
    int no;
    void  message(){
        System.out.println("no. in superclass:"+ no);
    }
}

class B1 extends  Super1{
     int no;
     B1(int a, int b){
         super.no=a;
         no=b;
     }

void message(){
    System.out.println("no in subClass:"+no);
}
void disp(){
    super.message();
    message();
}
}

class  Main1{
    public static void main(String[] args) {
        B1 obj=new B1(10,20);
        obj.disp();
    }
}