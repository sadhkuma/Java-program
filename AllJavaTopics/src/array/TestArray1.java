package array;

//Java Program to print the array elements using for-each loop
class Testarray1 {
    public static void main(String args[]) {
        int arr[] = {33, 3, 4, 5};
//printing array using for-each loop
        for (int i : arr)   //for-each loop prints the array elements one by one.
            // It holds an array element in a variable, then executes the body of the loop.
            System.out.println(i);
    }
}
