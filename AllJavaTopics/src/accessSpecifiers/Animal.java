package accessSpecifiers;

public class Animal {

    // Protected variable: Accessible within the same package and by subclasses
    protected String animalType = "Mammal";

    // Protected method: Accessible within the same package and by subclasses
    protected void makeSound() {
        System.out.println("Animal makes a sound.");
    }

}
