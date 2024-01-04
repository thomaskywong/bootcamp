package practiseinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PractiseFunctionalInterfaces {

  public static void main(String[] args) {

    // Function<T, R>
    // R apply(T t)
    // T and R shall be specified
    // Lambda expression -> Instantiate an object implements Function interface
    Function<String, String> reverse = str -> {
      StringBuilder result = new StringBuilder(str);
      result.reverse();
      return result.toString();
    };

    System.out.println(reverse.apply("Hello World!"));

    // Application of Function<T, R> interface
    // HashMap .computeIfAbsent()
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Thomas");
    map.put(2, "Mary");
    map.put(3, "David");
    map.computeIfAbsent(4, x -> "Peter");

    System.out.println(map);



    // BiFunction<T, U, R>
    // R apply(T t, U u)
    BiFunction<String, Integer, String> concatenate = (str, x) -> {
      StringBuilder result = new StringBuilder(str);
      result.append(" is number " + x + ".");
      return result.toString();
    };
    System.out.println(concatenate.apply("Thomas", 505));

    map.computeIfPresent(1, (x, y) -> "James");
    System.out.println(map);

    map.merge(3, "Diesel", (x, y) -> y.concat("Thomas"));
    System.out.println(map);


    // UnaryOperator<T> = Function<T, T> Function with the same input and output types
    // T apply(T t)
    UnaryOperator<Integer> absoluteVal = x -> {
      if (x >= 0)
        return x;
      else
        return -1 * x;
    };

    System.out.println(absoluteVal.apply(-22));
    System.out.println(absoluteVal.apply(30));

    UnaryOperator<Integer> absolute = Math::abs;
    System.out.println(absolute.apply(-20));

    // BinaryOperator<T> = BiFunction<T,T,T>
    // T apply(T t1, T t2)
    BinaryOperator<String> concat = (x, y) -> x.concat(y);
    System.out.println(concat.apply("Hello", " World! "));

    BinaryOperator<String> concat2 = String::concat;
    System.out.println(concat2.apply("This is", " Thomas!"));

    // Supplier<R>
    // R get()
    // No input, one output
    Supplier<Integer> random = () -> new Random().nextInt(10);
    System.out.println(random.get());

    // Consumer<T>
    // void accept(T t)
    // one input, no output
    Consumer<Integer> powerOfTwo = x -> {
      System.out.println(Math.pow(2, x));
    };
    powerOfTwo.accept(2);

    // Collection forEach( Consumer <? super T> consumer )
    List<Integer> list =
        new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    list.forEach(x -> System.out.print((2 * x) + " "));
    System.out.println();

    List<String> names = new ArrayList<>(List.of("Thomas", "James", "Percy"));
    Consumer<String> train = name -> System.out.println(name + " the Train.");
    names.forEach(train);

    // BiConsumer<T, U>
    // void accept(T t, U u)
    // two inputs, no output
    BiConsumer<String, Integer> concat3 =
        (str, num) -> System.out.println(str + " has " + num + " apples.");
    concat3.accept("Emily", 10);

    // Predicate<T>
    // boolean test(T t)
    // One input, boolean output
    Predicate<String> isLengthFive = str -> str.length() == 5;
    System.out.println(isLengthFive.test("Emily"));
    System.out.println(isLengthFive.test("Thomas"));

    // BiPredicate<T, U>
    // boolean test(T t, U u)
    // two inputs, boolean output
    BiPredicate<String, Character> isStartsWithC =
        (str, c) -> str.startsWith(String.valueOf(c));
    System.out.println(isStartsWithC.test("Thomas", 'T'));
    System.out.println(isStartsWithC.test("Thomas", 'M'));

    // combining Predicates
    // Predicate<T> and( Predicate<? super T> )
    // and
    Predicate<Integer> isPositive = x -> x >= 0;
    Predicate<Integer> isEven = x -> x % 2 == 0;
    Predicate<Integer> isPositiveEven = isPositive.and(isEven);
    System.out.println(isPositiveEven.test(10)); // true
    System.out.println(isPositiveEven.test(-10)); // false
    System.out.println(isPositiveEven.test(31)); // false

    // Predicate<T> or( Predicate<? super T> )
    // or
    Predicate<Integer> isMultipleOfThree = x -> x % 3 == 0;
    Predicate<Integer> isEvenOrMultiOfThree = isEven.or(isMultipleOfThree);
    System.out.println(isEvenOrMultiOfThree.test(33)); // true
    System.out.println(isEvenOrMultiOfThree.test(20)); // true
    System.out.println(isEvenOrMultiOfThree.test(-25)); // false
    System.out.println(isEvenOrMultiOfThree.test(-21)); // true

    // Predicate<T> negate( Predicate<? super T>)
    // not
    Predicate<Integer> isEvenAndNotMultipleOfThree =
        isEven.and(isMultipleOfThree.negate());
    System.out.println(isEvenAndNotMultipleOfThree.test(33)); // false
    System.out.println(isEvenAndNotMultipleOfThree.test(20)); // true
    System.out.println(isEvenAndNotMultipleOfThree.test(-25)); // false
    System.out.println(isEvenAndNotMultipleOfThree.test(-10)); // true

    // Combining Comparator
    Comparator<Cat> sortByAge = (c1, c2) -> c2.getAge() > c1.getAge() ? -1 : 1;
    Comparator<Cat> sortByName =
        (c1, c2) -> c2.getName().compareTo(c1.getName()) > 0 ? -1 : 1;

    Comparator<Cat> sortByNameThenAge = sortByName.thenComparing(sortByAge);
    Comparator<Cat> sortByAgeThenName = sortByAge.thenComparing(sortByName);

    Cat c3 = new Cat("Thomas", 10);
    Cat c2 = new Cat("Jerry", 15);
    Cat c1 = new Cat("Bobo", 8);
    Cat c6 = new Cat("Ama", 13);
    Cat c5 = new Cat("Thomas", 4);
    Cat c4 = new Cat("Thomas", 9);


    System.out.println("Sort by Age.");
    List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3, c4, c5, c6));
    Collections.sort(cats, sortByAge);
    System.out.println(cats);
    System.out.println();

    System.out.println("Sort by Name.");
    List<Cat> cats2 = new ArrayList<>(List.of(c1, c2, c3, c4, c5, c6));
    Collections.sort(cats2, sortByName);
    System.out.println(cats2);
    System.out.println();

    // List<Cat> cats3 = new ArrayList<>(List.of(c1, c2, c3, c4, c5, c6));
    // Collections.sort(cats3, sortByNameThenAge);
    // //cats3.forEach(c -> System.out.println(c.toString()));
    // System.out.println(cats3);
    // System.out.println();

    // List<Cat> cats4 = new ArrayList<>(List.of(c1, c2, c3, c4, c5, c6));
    // Collections.sort(cats4, sortByAgeThenName);
    // System.out.println(cats4);


    // Predicate<T> or( Predicate<? super T> )
    // PRedicate<T> negate()



  }
}


