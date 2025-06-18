/*Connecting a method call to the method body is known as binding.

When type of the object is determined at run-time, it is known as dynamic binding./Late Binding*/


package binding;

class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class DynamicBnding extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {
        Animal a = new DynamicBnding();
        a.eat();
    }
}
