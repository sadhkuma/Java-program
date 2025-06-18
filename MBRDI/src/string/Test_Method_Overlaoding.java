package string;

public class Test_Method_Overlaoding {
	public void display(Object o) {
		System.out.println("Object");
	}

	public void display(String s) {
		System.out.println("String");// if the method is overridden in a child class, the child class's method will
										// be executed, not the parent class's method.
	}
}
