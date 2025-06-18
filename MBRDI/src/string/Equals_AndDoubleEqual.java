package string;

public class Equals_AndDoubleEqual {
    public static void main(String[] args) {
        String s1="Ashok";//object referring to SCP
        String s2="Ashok";//object referring to SCP
        String s3=new String("Ashok");//object referring to heap

        System.out.println("--------s1 and s2 -----------");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        System.out.println("--------s1 and s3 -----------");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println("--------concatenation -----------");
        //Immutable
        String str = "Java";
        str.concat("Programming");
        System.out.println(str);

        str=str.concat("Programming");
        System.out.println(str);

    }
}
