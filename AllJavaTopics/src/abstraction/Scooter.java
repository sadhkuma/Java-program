package abstraction;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println(" Car starts with Key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("scooter sarts with kick");
    }


    public static void main(String args[]) {
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}
