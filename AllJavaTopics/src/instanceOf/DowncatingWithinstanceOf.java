package instanceOf;
class Animal {
}

class DowncatingWithinstanceOf extends Animal {
    static void method(Animal a) {
        if (a instanceof DowncatingWithinstanceOf) {
            DowncatingWithinstanceOf d = (DowncatingWithinstanceOf) a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }

    public static void main(String[] args) {
        Animal a = new DowncatingWithinstanceOf();
        DowncatingWithinstanceOf.method(a);
    }

}
