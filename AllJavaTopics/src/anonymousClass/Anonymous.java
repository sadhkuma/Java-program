package anonymousClass;

public class Anonymous {
        public void view() {
            System.out.println("Inside the Demo class");
        }
    }

    class MyClass {

        public void myMethod() {
            // creation of anonymous class extending class the class Demo
            Anonymous d1 = new Anonymous() {
                public void view() {
                    System.out.println("Inside the Anonymous Class");
                }
            };
            d1.view();
        }
    }

    class Main {

        public static void main(String[] args) {
            MyClass cls = new MyClass();
            cls.myMethod();
        }
    }



