package lambda;

import java.util.Objects;
import java.util.function.BiPredicate;

public class DemoBiPredicate {

  public static void main(String[] args) {

    BiPredicate<Integer, Integer> isGreater = (x, y) -> x > y;

    System.out.println(isGreater.test(20, 10));
    System.out.println(isGreater.test(1, 10));
    System.out.println();

    BiPredicate<String, String> isLonger = (x, y) -> x.length() > y.length();
    System.out.println(isLonger.test("Thomas", "Emily"));
    System.out.println(isLonger.test("James", "Gordon"));
    System.out.println();

    BiPredicate<String, Character> isStartsWith = (x, y) -> x.charAt(0) == y;
    System.out.println(isStartsWith.test("Thomas", 'T'));
    System.out.println(isStartsWith.test("James", 'G'));
    System.out.println();

    BiPredicate<String, Integer> isVowel = (str, index) -> {
      Objects.requireNonNull(str);    // throw NPE
      Objects.requireNonNull(index);  // throw NPE
      
      if (index > str.length() - 1 || index < 0)
        return false;

      if (str.charAt(index) == 'a' || str.charAt(index) == 'A'
          || str.charAt(index) == 'e' || str.charAt(index) == 'E'
          || str.charAt(index) == 'i' || str.charAt(index) == 'I'
          || str.charAt(index) == 'o' || str.charAt(index) == 'O'
          || str.charAt(index) == 'u' || str.charAt(index) == 'U') {

        return true;
      }

      return false;

    };

    System.out.println(isVowel.test("Thomas", 2));
    System.out.println(isVowel.test("James", 4));
    System.out.println(isVowel.test("James", 3));
    System.out.println(isVowel.test("James", 6));
    System.out.println(isVowel.test("James", -1));
    System.out.println();

    BiPredicate<String, String> isEqual = (str1, str2) -> str1.toLowerCase().equals(str2.toLowerCase());
    System.out.println(isEqual.test("Hello", "hello")); // true
    System.out.println(isEqual.test("Hello", "hEllO")); // true




  }
}
