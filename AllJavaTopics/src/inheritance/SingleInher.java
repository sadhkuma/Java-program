package inheritance;

    class SingleInher {
        // field and method of the parent class
        String name;
        public void eat() {
            System.out.println("I can eat");
        }
    }

    // inherit from SingleInher
    class Dog extends SingleInher {

        public void display() {
            System.out.println("My name is " + name);
        }
    }

    class TestInheritance {
        public static void main(String[] args) {

            // create an object of the subclass
            Dog labrador = new Dog();

            // access field of superclass
            labrador.name = "Sadhna";
            labrador.display();

            // call method of superclass
            // using object of subclass
            labrador.eat();

        }
    }

