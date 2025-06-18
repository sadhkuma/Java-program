package staticBlock;

public class NonStaticBlockWithConstructor {
	int num;

	NonStaticBlockWithConstructor() {
		System.out.println("inside the constructor");
	}

	// non-static block
	{
		System.out.println("Inside the non-static  block");// it will execute before the constructot
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticBlockWithConstructor();
	}
}
