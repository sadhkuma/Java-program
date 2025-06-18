package cloning;

import java.util.HashMap;
import java.util.Map;

public class CloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		Employee1 emp = new Employee1();

		emp.setId(1);
		emp.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp.setProps(props);

		Employee1 clonedEmp = (Employee1) emp.clone();
		System.out.println(clonedEmp);

		

		// change emp props
		emp.getProps().put("title", "CEO");
		emp.getProps().put("city", "New York");
		System.out.println("clonedEmp props:" + clonedEmp.getProps());

		// change emp name
		emp.setName("new");
		System.out.println("clonedEmp name:" + clonedEmp.getName());

	}
}
