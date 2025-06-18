package string;

public class Using_toStringMethod {
    int rollno;
    String name;
    String city;

    Using_toStringMethod(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }


    //overriding the toString() method
    // Since Java compiler internally calls toString() method,
    // overriding this method will return the specified values.

    public String toString(){
        return rollno+" "+name+" "+city;
    }
    public static void main(String args[]){
        Using_toStringMethod s1=new Using_toStringMethod(101,"Raj","lucknow");
        Using_toStringMethod s2=new Using_toStringMethod(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
