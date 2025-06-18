package abstraction;


interface  I1{
    public  void show();
}
 class TestInterface  implements  I1{
     @Override
     public void show() {
         System.out.println("1");
     }

     public static void main(String[] args) {
         TestInterface t=new TestInterface();
         t.show();
     }
 }
