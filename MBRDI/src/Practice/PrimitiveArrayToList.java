package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class PrimitiveArrayToList {
    public static void main(String[] args) {
        // Array of primitives (int[])
        int[] primitiveArray = {1, 2, 3, 4, 5};

        // Convert int[] to List<Integer> using Streams
        List<Integer> list = Arrays.stream(primitiveArray)  // Convert to stream
                                   .boxed()  // Convert to Integer (Boxing)
                                   .collect(Collectors.toList());  // Collect into a List

        // Print the list
        System.out.println("List: " + list);
    }
}

