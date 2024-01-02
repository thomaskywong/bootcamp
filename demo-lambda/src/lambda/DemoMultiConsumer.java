package lambda;

import java.text.NumberFormat;

public class DemoMultiConsumer {

  public static void main(String[] args) {


    MultiConsumer<Student, Book, Double> consumer = (x, y, z) -> {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      System.out.println(x.getName() + " buys a book called " + y.getName()
          + " with the price of HKD " + formatter.format(z));
    };

    Book book = new Book("Classical Physics");
    Student student = new Student("Mary");
    double price = 100.0d;

    consumer.accept(student, book, price);
    
  }



}
