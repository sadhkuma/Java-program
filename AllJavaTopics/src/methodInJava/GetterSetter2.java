package methodInJava;

public class GetterSetter2 {
    private int roll;
    private String name;

    public int getRoll()    //accessor/getter method
    {
        return roll;
    }

    public void setRoll(int roll) //mutator/setter method
    {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Roll no.: " + roll);
        System.out.println("Student name: " + name);
    }

    // main method
    public static void main(String arg[]) {
        // Creating an object of the Employee class
        GetterSetter2 emp = new GetterSetter2();

        // the employee details are getting set using the setter methods.
         emp.setRoll(107);
        emp.setName("Kathy");
        emp.display();
    }
}


