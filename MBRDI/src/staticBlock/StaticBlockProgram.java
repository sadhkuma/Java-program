package staticBlock;

public class StaticBlockProgram {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}

	static {
		System.out.println("static block1");// static block gets executed first then main method
	}
	static {
		System.out.println("static block2");// static block gets executed first then main method
		// If we have multiple static block then jvm will maintain the order and static
		// block will execute first
	}
}
