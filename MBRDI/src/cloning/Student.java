package cloning;

public class Student implements Cloneable {
	 int id;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student std=(Student) super.clone();
		//std.address=(Address) address.clone();
		return std;
	}

}
