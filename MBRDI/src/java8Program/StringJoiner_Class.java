package java8Program;

import java.util.StringJoiner;

public class StringJoiner_Class {
	public static void main(String[] args) {
		 StringJoiner stj = new StringJoiner(",");
		 // Separated the elements with a comma in between.

		 stj.add("Saket");
		 stj.add("John");
		 stj.add("Franklin");
		 stj.add("Ricky");
		 stj.add("Trevor");

		 System.out.println(stj);
}
}
