import Calculable;
import Walkable;

package lambda;
public class DemoLambda {
    public static void main(String[] args) {
        // inner class
        Walkable person = new Walkable() {
            @Override
            public void walk() {
                System.out.println("Walking...");
            }
        };

        person.walk();


        // lambda expression - Overriding the interface method
        // 1. we don't need to write down method signature for the walk() method. Why?
        // because the interface has only one walk() method, so compliler knows the code block must
        // refer to the walk() method
        // 2. "()" is the input parametes of the walk method.
        // 3. As walk method is void return type, so nothing to be returned inside the code block
        // 4. Lambda implementation: can only be used when there is only one method in interface
        // 5. No {} is need for code block if only one statement in code block. No "return" keyword required.
        //    If more than one statement, and code block is used, "return" keyword is required.
        // 6. For interface method with parameters, say (int x, int y), lambda expression becomes 
        //    InterfaceName obj = (a, b) -> { // implementation codes };
        // 7. Input parameter type can be neglected. No need to specified since only one method is available
        // 8. Lambda express instantiate an object implementing interface without keyword "new"
        

        System.out.println("Lambda expression for no-parameter method:");
        Walkable person2 = () -> {
            System.out.println("Hello");
            System.out.println("hello world");
        };

        person2.walk();
        System.out.println();

        // (a, b) = (int x, int y) defined in interface method
        System.out.println("Lambda expression for overriding with-parameters method");
        Calculable addition = (a, b) -> a + b ;
        System.out.println(addition.compute(1,2));  // 3

        Calculable compensation = (salary, bonus) -> salary + bonus ;
        System.out.println(compensation.compute(10000,2000));  // 12000
        System.out.println();

        System.out.println("Lambda express for overriding the SAME with-parameters method");
        Calculable product = (a, b) -> {
            return a * b;
        };
        System.out.println(product.compute(3,4));   // 12

    }
}
