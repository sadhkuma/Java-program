package java11;

import java.util.List;
import java.util.stream.Collectors;

public class Lines_method {
	public static void main(String[] args) {
		String str = "Geeks\nFor\nGeeks";
        System.out.println(
            str.lines().collect(Collectors.toList()));
        //This method is to return a collection of strings that are divided by line terminators.
        
        List<String> str1=str.lines().collect(Collectors.toList());
        str1.forEach(s->System.out.println(s));
        
	}

}
