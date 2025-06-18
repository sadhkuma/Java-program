package cloning;

public class ShallowCloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Sadhna", 28);
		Employee e1 = (Employee) e.clone();
		System.out.println(e);
		System.out.println(e1);
	}
}
