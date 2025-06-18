package Upcasting;

//If the reference variable of Upcasting.Parent class refers to the object of Child class, it is known as upcasting.
class Parent{
    void run(){System.out.println("running");}
}
class Upcasting extends Parent{
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        Parent b = new Upcasting();//upcasting
        b.run();
    }
}
