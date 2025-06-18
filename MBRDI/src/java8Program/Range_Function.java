package java8Program;

import java.util.stream.IntStream;

public class Range_Function {
public static void main(String[] args) {
	System.out.println(IntStream.range(1, 10).max());
	System.out.println(IntStream.range(1, 10).sum());
	
	//parrallell stream
	
	System.out.println(IntStream.range(1, 10).parallel().sum());
}
}
