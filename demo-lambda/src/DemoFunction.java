

import java.util.function.Function;

public class DemoFunction {

  public static void main(String[] args) {

    // f(x) = x + 3
    // y = x + 3

    // T argument type is String, R return type is Integer
    Function<String, Integer> stringLength = (str) -> {
      return str.length();
    };

    System.out.println(stringLength.apply("Hello")); // 5



    Function<String, String> reverseString = str -> {
      StringBuilder output = new StringBuilder("");

      for (int i = 0; i < str.length(); i++) {
        output.append(str.charAt(str.length() - 1 - i));
      }

      return output.toString();

    };

    System.out.println(reverseString.apply("This is Thomas."));

    Function<String, String> concatHello = s -> "Hello ".concat(s).concat(".");

    System.out.println(concatHello.apply("Thomas"));


  }

}
