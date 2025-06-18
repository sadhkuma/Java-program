package Practice;

public class ObjectCloningExample {
	
	//1st way by throwing exception
	public static void main(String[] args) throws CloneNotSupportedException {
		CloningExample std = new CloningExample(101, "Supriya");
		CloningExample std1 = (CloningExample) std.clone();
		System.out.println(std);
		System.out.println(std1);

	}
	
	//by try catch
//	public static void main(String[] args) {
//		Student std = new Student(101, "Supriya");
//		Student std1 = null;
//		try {
//			std1 = (Student) std.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(std);
//		System.out.println(std1);
//	}
}
