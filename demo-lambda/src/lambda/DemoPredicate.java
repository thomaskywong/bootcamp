package lambda;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {

  public static void main(String[] args) {
    int age = 17;
    boolean isAdult = age >= 18;

    Predicate<Integer> isAdult2 = x -> {
      return x >= 18;
    };

    Predicate<Integer> isAdult3 = x -> x >= 18;


    System.out.println(isAdult2.test(17)); // false
    System.out.println(isAdult2.test(18)); // true
    System.out.println(isAdult2.test(19)); // true
    System.out.println();

    System.out.println(isAdult3.test(7)); // false
    System.out.println(isAdult3.test(8)); // false
    System.out.println(isAdult3.test(39)); // true

    Function<Integer, Boolean> isAdult4 = x -> x >= 18;
    System.out.println(isAdult4.apply(20)); // true
    System.out.println(isAdult4.apply(10)); // false

    Predicate<Integer> isChild = x -> x >= 0 && x < 18;
    System.out.println(isChild.test(10)); // true
    System.out.println(isChild.test(20)); // false



  }

}
