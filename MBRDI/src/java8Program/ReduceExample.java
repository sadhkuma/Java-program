package java8Program;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce with BinaryOperator only
        Optional<Integer> sumOptional = numbers.stream().reduce((a, b) -> a + b);
        sumOptional.ifPresent(sum -> System.out.println("Sum: " + sum)); // Output: Sum: 15

        // Using reduce with identity and BinaryOperator
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product); // Output: Product: 120

        // Using reduce with identity, BiFunction, and BinaryOperator (for parallel streams)
        int sumOfSquares = numbers.parallelStream().reduce(
            0,                                     // identity
            (a, b) -> a + b * b,                    // accumulator
            (a, b) -> a + b                         // combiner
        );
        System.out.println("Sum of squares: " + sumOfSquares); // Output: Sum of squares: 55
    }
}
