/**
 * Exercise: Use Lambda expression to implement 
 * FunctionalInterface1 and FunctionalInterface2. 
 * Call operate method to perform the operations and generate expected output.
 */
/**
 * Expected Output: 
 * FunctionalInterface1: Addition is 9 
 * FunctionalInterface1: Multiplication is 18 
 * FunctionalInterface2: I'm learning Lambda Expression
 * FunctionalInterface2: Yeah, I can use it now
 */
public class Exercise33 {
    // operation is implemented using lambda expressions
    interface FunctionalInterface1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions above
    interface FunctionalInterface2 {
        void sayMessage(String message);
    }

    // Performs FunctionalInterface1's operation on a and b
    private int operate(int a, int b, FunctionalInterface1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {



        // lambda expression for addition for two parameters
        // This expression implements FunctionalInterface1 interface
        FunctionalInterface1 addition = (a, b) -> a + b;

        // lambda expression multiplication for two parameters
        // This expression also implements FunctionalInterface1 interface
        FunctionalInterface1 multiplication = (a, b) -> a * b;

        // Creating an object of Test to call operate() method using
        // different implementations using lambda Expressions
        FunctionalInterface2 message = str -> System.out.println(str);

        Exercise33 tobj = new Exercise33();

        // Add two numbers using lambda expression
        System.out.println("FunctionalInterface1: Addition is " + tobj.operate(4, 5, addition));

        // Multiply two numbers using lambda expression
        System.out.println("FunctionalInterface1: Multiplication is " + tobj.operate(2, 9, multiplication));

        // lambda expression for single parameter
        // This expression implements FunctionalInterface2 interface
        message.sayMessage("FunctionalInterface2: I'm learning Lambda Expression");
        message.sayMessage("FunctionalInterface2: Yeah, I can use it now");

    }
}
