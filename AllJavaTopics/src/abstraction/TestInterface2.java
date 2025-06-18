package abstraction;


interface Displayable {
    void print();
}

interface printable extends Displayable {
    void show();
}

class TestInterface2 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        TestInterface2 obj = new TestInterface2();
        obj.print();
        obj.show();
    }
}
