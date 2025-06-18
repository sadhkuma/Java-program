package usesOfStaticKeyword;



    //Java Program to illustrate the use of static variable which
//is shared with all objects.
    class withStatic{
        static int count=0;//will get memory only once and retain its value

        withStatic(){
            count++;//incrementing the value of static variable
            System.out.println(count);
        }

        public static void main(String args[]){
//creating objects
            withStatic c1=new withStatic();
            withStatic c2=new withStatic();
            withStatic c3=new withStatic();
        }
    }

