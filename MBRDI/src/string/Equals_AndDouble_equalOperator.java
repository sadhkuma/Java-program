package string;

public class Equals_AndDouble_equalOperator {
	public static void main(String[] args) {
		// Primitive types comparison (using `==`)
		int a = 10;
		int b = 10;
		System.out.println(a == b); // true, because both have the same value
		

		String str1 = new String("Hello");
		String str2 = new String("Hello");

		// Using == to compare references
		System.out.println(str1 == str2); // false, because they are different objects in memory

		// Using equals() to compare content
		System.out.println(str1.equals(str2)); // true, because the contents are the same

		System.out.println("----------------");
		
		Student s1 = new Student("Mohan");
		Student s2 = new Student("Mohan");
		// .equals() and ==
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}
}
