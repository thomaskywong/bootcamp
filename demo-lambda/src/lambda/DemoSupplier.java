package lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class DemoSupplier {

  public static void main(String[] args) {
    
    // Supplier<R> - input nothing, return an Integer
    Supplier<Integer> random = () -> new Random().nextInt(100);     // Supply a random number from 1 - 100
    System.out.println(random.get());

    Supplier<Book> book = () -> new Book();
    Book b1 = book.get();
    b1.setName("Introduction of Calculus.");
    System.out.println(b1.getName());

  }
  
}
