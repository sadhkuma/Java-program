package accessSpecifiers;


public class program1 {

    // Public variable: Accessible everywhere
    public String publicMessage = "This is a public message.";

    // Private variable: Accessible only within this class
    private String privateMessage = "This is a private message.";

    // Protected variable: Accessible within the same package and by subclasses
    protected String protectedMessage = "This is a protected message.";

    // Default (no modifier) variable: Accessible only within the same package
    String defaultMessage = "This is a default message.";

    // Public method: Accessible everywhere
    public void displayPublicMessage() {
        System.out.println(publicMessage);
    }

    // Private method: Accessible only within this class
    private void displayPrivateMessage() {
        System.out.println(privateMessage);
    }

    // Protected method: Accessible within the same package and by subclasses
    protected void displayProtectedMessage() {
        System.out.println(protectedMessage);
    }

    // Default (no modifier) method: Accessible only within the same package
    void displayDefaultMessage() {
        System.out.println(defaultMessage);
    }

    public static void main(String[] args) {
        program1 obj = new program1();

        // Accessing public method and variable
        obj.displayPublicMessage();
        System.out.println(obj.publicMessage);

        // Accessing private method and variable (not allowed outside the class)
        // obj.displayPrivateMessage(); // Uncommenting this will cause a compile-time error
        // System.out.println(obj.privateMessage); // Uncommenting this will cause a compile-time error

        // Accessing protected method and variable
        obj.displayProtectedMessage();
        System.out.println(obj.protectedMessage);

        // Accessing default method and variable
        obj.displayDefaultMessage();
        System.out.println(obj.defaultMessage);
    }
}
