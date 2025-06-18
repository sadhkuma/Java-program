package abstraction;

//interface name should end with “able” or “ible” like Printable
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MultipleInheritance_Done_ByInterface_NotClass implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        MultipleInheritance_Done_ByInterface_NotClass obj = new MultipleInheritance_Done_ByInterface_NotClass();
        obj.print();
        obj.show();
    }
}
