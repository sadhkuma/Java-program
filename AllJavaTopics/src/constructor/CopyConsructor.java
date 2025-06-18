package constructor;


class CopyConsructor {
    private int value;
    private String text;

    public CopyConsructor(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public CopyConsructor(CopyConsructor other) {
        this.value = other.value;
        this.text = other.text;
    }

    public void display() {
        System.out.println("Value: " + value + ", Text: " + text);
    }

    public static void main(String[] args) {
        CopyConsructor obj1 = new CopyConsructor(10, "Hello");
        CopyConsructor obj2 = new CopyConsructor(obj1);

        obj1.display();
        obj2.display();
    }
}