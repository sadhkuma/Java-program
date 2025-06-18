

package accessSpecifiers; // Different package from Animal

public class Cat extends Animal {

    // Accessing the protected variable and method from Animal class
    public void displayInfo() {
        System.out.println("Animal Type: " + animalType);  // Accessing protected member
        makeSound();  // Calling protected method
    }


}
