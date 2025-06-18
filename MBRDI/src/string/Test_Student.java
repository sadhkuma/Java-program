package string;
 import  java.util.*;
public class Test_Student {
	public static void main(String[] args) {

		Student s1 = new Student("Mohan");
		Student s2 = new Student("Mohan");
		//.equals()  and ==
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);//false
		
		Map<Student,String> hm = new HashMap<>();
		hm.put(s1,"a");
		hm.put(s2,"b");
		 
		System.out.println(hm.size());

	}
}