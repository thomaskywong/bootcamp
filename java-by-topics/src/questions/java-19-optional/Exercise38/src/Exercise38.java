// package Exercise38.src;

import java.util.*;
import java.util.function.*;

/**
 * Exercise: Try orElseThrow() to handle exception. Declare a custom Expection class with a String Message Constructor. Implement try/catch block to catch the custom expcetion and print the message
 * you passed in.
 */
/**
 * Expected Output: 
 * Optional: Optional.empty 
 * it's throwing my Custom Expection
 */

// Implement a custom exception class with a String Message Constructor.

public class Exercise38 {
    public static void main(String[] args) {

        // create a Optional
        Optional<Integer> op = Optional.empty();
        try{
            op.orElseThrow(() -> new NoSuchElementException("Optional: Optional.empty"));
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
            System.out.println("it's throwing my Custom Expection");
        }
        // You can try assign an integer after you implemented orElseThrow()
        op = Optional.of(100);

        // print supplier
        op.ifPresent( x -> System.out.println("Optional: " + x));

        // Implement try/catch block to catch custom exception
        // If op is presented, print "op is Present: "
        // Use op.orElseThrow() to throw exception if op is not presented.
        //op = Optional.empty();
        op = Optional.of(2000);
        // System.out.println();
        System.out.println("Test orELseThrow");
        
        try {
            op.orElseThrow(() -> new NoSuchElementException("Optional: Optional.empty"));
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
            System.out.println("it's throwing my Custom Expection");
        } finally {
            op.ifPresent(integer -> System.out.println("op is Present: " + integer));
        }

   

        // orElseThrow - Provide supplier
        // Approach 2:
        try {
            System.out.println("op is Present: " + op.orElseThrow(() -> new EmptyOptionalException("Optional: Optional.empty"))); // revise it
        } catch (EmptyOptionalException ex) {
            System.out.println(ex.getMessage());
            System.out.println("it's throwing my Custom Expection");
        }
    }
}
