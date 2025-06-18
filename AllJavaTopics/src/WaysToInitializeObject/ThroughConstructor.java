package WaysToInitializeObject;
class ThroughConstructor{
    int id;
    String name;
    float salary;
    //parameterized constructor
     ThroughConstructor(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}

    public static void main(String[] args) {
        ThroughConstructor con1=new ThroughConstructor(101,"ajeet",45000);
        ThroughConstructor con2=new ThroughConstructor(102,"irfan",25000);
        ThroughConstructor con3=new ThroughConstructor(103,"nakul",55000);

        con1.display();
        con2.display();
        con3.display();
    }
}

