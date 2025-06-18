package WaysToInitializeObject;
public class ThroughMethod {
        int rollno;
        String name;
        void insertRecord(int r, String n){
            rollno=r;
            name=n;
        }
        void displayInformation(){
            System.out.println(rollno+" "+name);
        }
    }
    class TestStudent4{
        public static void main(String args[]){
            ThroughMethod obj1=new ThroughMethod();
            ThroughMethod obj2=new ThroughMethod();
            obj1.insertRecord(111,"Avyukt");
            obj2.insertRecord(222,"Kisu");
            obj1.displayInformation();
            obj2.displayInformation();
        }
    }

