package lambda;

import java.text.NumberFormat;

public class DemoMultiConsumer {

  public static void main(String[] args) {


    SuperConsumer<Student, Book, Double> consumer = (x, y, z) -> {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      System.out.println(x.getName() + " buys a book called " + y.getName()
          + " with the price of HKD " + formatter.format(z));
    };

    Book book = new Book("Classical Physics");
    Student student = new Student("Mary");
    double price = 100.0d;

    consumer.accept(student, book, price);
    System.out.println();

    CommonConsumer<Student> students = (x, y, z) -> { 
      System.out.println("1st place: " + x.getName() + ", 2nd place: " + y.getName() + ", 3rd place: " + z.getName());
    };

    students.accept(new Student("Thomas"), new Student("James"), new Student("Percy"));
    
  }



}
