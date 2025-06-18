package string;

public class Calling_Test_Method_Overlaoding1 {
	public static void main(String[] args) {
		// creating object Test_Method_Overlaoding1 class
		Test_Method_Overlaoding1 t1 = new Test_Method_Overlaoding1();
		// t1.display(null); //it will give compiler error, beacuse String and
		// stringBuilder is having same hierarchy level
		t1.display("sadhna");
		t1.display(23);
	}
}
