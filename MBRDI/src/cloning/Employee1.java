package cloning;

import java.util.Map;

public class Employee1 implements Cloneable {

	private int id;

	private String name;

	private Map<String, String> props;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}
	

	 @Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", props=" + props + "]";
	}

	@Override
	 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
	 }
}
