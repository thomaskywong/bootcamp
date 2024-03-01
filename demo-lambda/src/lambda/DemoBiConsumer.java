package lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;


public class DemoBiConsumer {

  public static void main(String[] args) {

    BiConsumer<Student, Book> biConsumer = (x, y) -> System.out
        .println(x.getName() + " loves reading " + y.getName());
    biConsumer.accept(new Student("Thomas"),
        new Book("Introduction of Calculus"));
    System.out.println();

    Student john = new Student("John");
    Supplier<Random> random = () -> new Random();

    BiConsumer<Student, Supplier<Random>> biConsumer2 =
        (x, y) -> System.out.println(
            x.getName() + " has a lucky number of " + y.get().nextInt(100));
    biConsumer2.accept(john, random);
    System.out.println();

    Student thomas = new Student("Thomas");
    Random random2 = new Random();
    BiConsumer<Student, Random> biConsumer3 = (x, y) -> System.out
        .println(x.getName() + " has a random number of " + y.nextInt(100));
    biConsumer3.accept(thomas, random2);

  }

}
