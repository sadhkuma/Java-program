package java11;

public class Strip_method {
	public static void main(String args[]) {
		String str = "GeeksForGeeks ";
		System.out.println(str.stripTrailing());// It is used to remove the white space which is in the back of the
												// string

		System.out.println(str.stripLeading());// It is used to remove the white space which is in front of the stringF

		System.out.println(str.strip());// It is used to remove the white spaces which are in front and back of the
										// string
	}
}
