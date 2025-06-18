package staticBlock;

public class StaticMethodProgram {
	public static void main(String[] args) {
		System.out.println("Inside the main");
		StaticMethodProgram.method1();
	}

	static void method1() {
		System.out.println("inside method 1");
	}

	static {
		StaticMethodProgram.method1();
		System.out.println(" Inside the static block1");// static block gets executed first then main method
	}
}
