package aggregation;
 class AddressAggr {
        String city,state,country;

        public AddressAggr(String city, String state, String country) {
            this.city = city;
            this.state = state;
            this.country = country;
        }

    }

    public class Aggregation1 {
        int id;
        String name;
        AddressAggr address;

        public Aggregation1(int id, String name,AddressAggr address) {
            this.id = id;
            this.name = name;
            this.address=address;
        }

        void display(){
            System.out.println("Id: "+id+" "+"Name: "+name);
            System.out.println("City: "+address.city+" "+"state: "+address.state+" "+"country: "+address.country);
        }

        public static void main(String[] args) {
            AddressAggr obj1=new AddressAggr("DARBHANGA","BIHAR","india");
            AddressAggr obj2=new AddressAggr("MADHUBANI","bIHAR","india");

            Aggregation1 e=new Aggregation1(111,"varun",obj1);
            Aggregation1 e2=new Aggregation1(112,"ARUN",obj2);

            e.display();
            e2.display();

        }
    }

