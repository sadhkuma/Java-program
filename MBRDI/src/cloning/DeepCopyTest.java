package cloning;

public class DeepCopyTest {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Student s1=new Student();
		s1.id=10;
		
		Address address=new Address();
		address.addressId=02;
		s1.address=address;
		
		Student s2=(Student) s1.clone();
		s2.id=15;
		s2.address.addressId=39;
		
		System.out.println(s1.id);
		System.out.println(s2.id);
		
		System.out.println("=======================");
		
		
		System.out.println(s1.address.addressId);
		System.out.println(s2.address.addressId);
	}

}
