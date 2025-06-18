package string;

public class Test_Method_Overlaoding1 {
	public void display(Object o) {
		System.out.println("Object");
	}

	public void display(String s) {
		System.out.println("String");
	}

	public void display(StringBuilder sb) {
		System.out.println("StringBuiler");
	}
}
