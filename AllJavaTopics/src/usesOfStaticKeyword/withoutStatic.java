package usesOfStaticKeyword;


    //Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
    class withoutStatic{
        int count=0;//will get memory each time when the instance is created

        withoutStatic(){
            count++;//incrementing value
            System.out.println(count);
        }

        public static void main(String args[]){
//Creating objects
            withoutStatic c1=new withoutStatic();
            withoutStatic c2=new withoutStatic();
            withoutStatic c3=new withoutStatic();
        }
    }

