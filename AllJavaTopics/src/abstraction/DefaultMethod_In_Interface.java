package abstraction;

interface I {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class Draw implements I {
    public void draw() {
        System.out.println("Welcome");
    }
}

class DefaultMethod_In_Interface {
    public static void main(String args[]) {
        I i = new Draw();
        i.draw();
        i.msg();
    }
}
