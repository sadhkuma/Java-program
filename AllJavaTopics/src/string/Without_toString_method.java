package string;

public class Without_toString_method {
    int rollno;
    String name;
    String city;

    Without_toString_method(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public static void main(String args[]){
        Without_toString_method s1=new Without_toString_method(101,"Raj","lucknow");
        Without_toString_method s2=new Without_toString_method(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
