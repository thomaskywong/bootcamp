package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoOperator {

  public static void main(String[] args) {
    
    // BinaryOpeator <T>
    // two input of the same type T, one output of the same type T
    BinaryOperator<String> concatStrings = (s1, s2) -> s1.concat(s2);
    System.out.println(concatStrings.apply("Hello", " World"));

    UnaryOperator<String> helloString = s -> "Hello ".concat(s);
    System.out.println(helloString.apply("World!"));

    BinaryOperator<Integer> sumation = (x, y) -> x + y;
    int result = sumation.apply(2,3);
    System.out.println(result); // 5

    UnaryOperator<String> removeSpace = s -> s.replace(" ", "");
    System.out.println(removeSpace.apply("He ll o"));

    UnaryOperator<Integer> reverse = x -> -1 * x;
    System.out.println(reverse.apply(10));


  }
  
}
