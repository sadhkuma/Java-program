package aggregation;
//using toString() method
    class Address1 {
        private String street;
        private String city;
        private String state;
        private String zipCode;

        public Address1(String street, String city, String state, String zipCode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        public String toString() {
            return "street: "+street+ ", " + "city: "+ city + ", " + "state: "+state + " " + "zipCode: " +zipCode;
        }
    }

    class Person {
        private String name;
        private int age;
        private Address1 address;

        public Person(String name, int age, Address1 address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return "Name: "+name + ", " + "Age: "+age + ", " +address.toString();
        }
    }

    public class Aggregation2 {
        public static void main(String[] args) {
            Address1 obj = new Address1("123 Main St", "Anytown", "CA", "12345");
            Person person = new Person("Mohit", 20, obj);

           // System.out.println(person);  // //compiler writes here person.toString() so we don't need to write person.toString()
            System.out.println(person.toString());
        }
    }
