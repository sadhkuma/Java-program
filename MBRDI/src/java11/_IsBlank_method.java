package java11;

public class _IsBlank_method {
	public static void main(String[] args) {
		String str1 = "";
        System.out.println(str1.isBlank());
        //This is a boolean method. It just returns true when a string is empty and vice-versa.
 
        String str2 = "GeeksForGeeks";
        System.out.println(str2.isBlank());
	}
}
