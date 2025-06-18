package staticBlock;

public class StaticAndNon_StaticBlock {

	int num;

//constructor
	StaticAndNon_StaticBlock() {
		System.out.println("inside the constructor");
	}

	// non-static block
	{
		System.out.println("Inside the non-static  block");// it will execute before the constructot
	}

	static {// it will execute once it doesn't matter how many time we are creating object

		System.out.println("Inside the static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new StaticAndNon_StaticBlock();
		new StaticAndNon_StaticBlock();
		new StaticAndNon_StaticBlock();

	}

}
