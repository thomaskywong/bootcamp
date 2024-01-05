package Exercise37.src;

import java.util.Optional;
import java.util.Random;
import java.util.Arrays;

/**
 * Exercise: Practice Optional.of()/ ofNullable()/ orElseGet()/ ifPresentOrElse()
 */
/**
 * Expected Output:
 * Optional: Optional[9455]
 * op1's value is present: 9455
 * Optional op2: Optional.empty
 * Convert Optional<Integer> to Integer: 3
 */
class Exercise37Ans {

    public static void main(String[] args) {
        
        Integer a = 1;
        //System.out.println(Integer.toBinaryString(100)); // convert 100 to binary value 1100100 

        Integer b = a + 1000;       // Integer could use arithmetic operator
        //System.out.println(b);

        // New an array
        int[] arr = new int[3]; // [0, 0, 0]
        int[] arr2 = { 1, 3 };  // [1, 3]
        int[] arr3 = new int[] { 1, 4 }; // [1, 4]
        
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(arr3));

        // create a Optional by Optional.of
        Optional<Integer> op = Optional.of(9455);


        // print value op
        op.ifPresent(x -> System.out.println("Optional[" + x + "]"));

        Optional<Integer> op1 = Optional.of(9455);
        //Optional<Integer> op1 = Optional.empty();
        // Use ifPresentOrElse method to print different statements
        // If it presents, print "op1's value is present: "
        // Otherwise, print "op1's value is empty"
        // Code here ...
        op1.ifPresentOrElse(x -> System.out.println("op1's value is present: " + x), () -> System.out.println("op1's value is empty"));

        // Declare another Optional<Integer> variable with null value assigned
        // Code here ...
        Optional<Integer> op2 = Optional.empty();
        // Optional<Integer> op2 = Optional.of(100);

        // print value op2
        op2.ifPresentOrElse( x -> System.out.println("Optional op2: " + x), () -> System.out.println("Optional op2: Optional.empty"));

        // Convert Optional<Integer> to Integer
        // By using orElseGet() method to handle null scenario, by assigning random
        // number 0 - 10 if op2 is null
        // Tips: You can use Random()
        // Code here ...
        Integer op2Integer = op2.orElseGet(() -> new Random().nextInt(11));

        // print value op2
        System.out.println("Convert Optional<Integer> to Integer: " + op2Integer);

    }
}
