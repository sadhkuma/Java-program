package inheritance;

class MethodOverridingOrRuntimepolymorphism {

        // method in the superclass
    public void eat() {    //to call parent class method we use "Super" keyword

            System.out.println("I can eat");
        }
    }

    // Cow inherits MethodOverridingOrRuntimepolymorphism
    class Cow extends MethodOverridingOrRuntimepolymorphism {

        // overriding the eat() method
        @Override
        public void eat() {
            System.out.println("I eat Cow food");
        }

        // new method in subclass
        public void moo() {
            System.out.println("I can moo");
        }
    }

    class Main {
        public static void main(String[] args) {

            // create an object of the subclass
            Cow labrador = new Cow();

            // call the eat() method
            labrador.eat();//here child class method will call
                            // because the method inside the derived class
                             //overrides the method inside the base class
            labrador.moo();
        }
    }

