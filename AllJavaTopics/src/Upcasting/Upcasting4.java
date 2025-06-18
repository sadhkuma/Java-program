package Upcasting;

//Runtime polymorphism can't be achieved by data members.
class Bike{
    int speedlimit=90;
}
class Upcasting4 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new Upcasting4();
        System.out.println(obj.speedlimit);//90
    }
}