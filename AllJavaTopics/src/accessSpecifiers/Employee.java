package accessSpecifiers;


public class Employee {

    // Public variable: Accessible everywhere
    public String employeeName;

    // Public method: Accessible everywhere
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + employeeName);
    }

    // Public constructor: Accessible everywhere
    public Employee(String name) {
        this.employeeName = name;
    }
}

