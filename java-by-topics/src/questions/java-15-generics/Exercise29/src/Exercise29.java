import java.io.File;
import java.util.Objects;
import java.util.Scanner;

/**
 * Exercise: 
 * Implement a generic method genericDisplay() to print the class name and its assigned value
 */
/**
 * Expected Output:
 * java.lang.Integer = 11
 * java.lang.Byte = 11
 * java.lang.String = Venturenix LAB
 * java.lang.Double = 1.0
 * java.lang.Float = 1.0
 */
class Exercise29 {
    // Code here, generic method genericDisplay()

    public static <T> void genericDisplay(T t) {
        Objects.requireNonNull(t);
        
        if (t instanceof Integer) {
            System.out.println(t.getClass() + " = " + (Integer) t);
        }
        if (t instanceof Byte) {
            System.out.println(t.getClass() + " = " + (Byte) t);
        }
        if (t instanceof String) {
            System.out.println(t.getClass() + " = " + (String) t);
        }
        if (t instanceof Double) {
            System.out.println(t.getClass() + " = " + (Double) t);
        }
        if (t instanceof Float) {
            System.out.println(t.getClass() + " = " + (Float) t);
        }
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument (Default int)
        genericDisplay(11);

        genericDisplay((byte) 11);

        // Calling generic method with String argument
        genericDisplay("Venturenix LAB");

        // Calling generic method with double argument (Default double)
        genericDisplay(1.0);

        genericDisplay((float) 1.0);
    }
}