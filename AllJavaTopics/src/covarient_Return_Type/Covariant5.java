package covarient_Return_Type;

class Parent {
    public Object getFoo() {
        return null;///return new Parent(); or return this;
    }
}

class Covariant5 extends Parent {
    // String is child of the greater Object class
    public String getFoo() {
        return "This is a string";
    }

    // Driver code
    public static void main(String[] args) {
        Covariant5 child = new  Covariant5();
        System.out.println(child.getFoo());
    }
}

