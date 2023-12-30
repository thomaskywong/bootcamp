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

  }

}
