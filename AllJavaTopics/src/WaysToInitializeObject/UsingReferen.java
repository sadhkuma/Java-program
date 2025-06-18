package WaysToInitializeObject;
public class UsingReferen {
    int id;
    String name;
    }
    class TestStudent2{
        public static void main(String args[]){
            //Creating objects
            UsingReferen s1=new UsingReferen();
            UsingReferen s2=new UsingReferen();
            //Initializing objects
            s1.id=101;
            s1.name="Sadhna";
            s2.id=102;
            s2.name="Avinash";
            //Printing data
            System.out.println(s1.id+" "+s1.name);
            System.out.println(s2.id+" "+s2.name);
        }
    }

