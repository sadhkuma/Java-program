package Practice;

public class CloningExample implements Cloneable {
	private int id;
	private String name;

	public CloningExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
