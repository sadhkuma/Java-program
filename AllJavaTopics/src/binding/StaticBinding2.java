package binding;


class StaticBinding2 {
    private void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {
        StaticBinding2 d1 = new StaticBinding2();
        d1.eat();
    }
}
