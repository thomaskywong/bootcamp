import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Book(" //
           + "name = " + this.name
           + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Book))
      return false;

    Book book = (Book) obj;

    return Objects.equals(this.name, book.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }


  public static void main(String[] args) {

    List<Book> books = new ArrayList<Book>();

    books.add(new Book("Introduction of Probability"));
    books.add(new Book("Introduction of Classical Physics"));
    Book book1 = new Book("Object Oriented Programming in Java");
    Book book2 = new Book("Object Oriented Programming in Java");
    Book book3 = new Book("Object Oriented Programming in C++");

    books.add(book1);
    books.add(book2);
    books.add(book3);
    System.out.println(books);
    System.out.println();

    System.out.println(book1.equals(book2)); // true
    System.out.println(book1.hashCode()); // 891534042
    System.out.println(book2.hashCode()); // 891534042
    System.out.println(book3.hashCode()); // -525438615
    System.out.println();


    // contains Book ABC
    if (books.contains(book1)) { // true after overriding .equals() method
      System.out.println(book1.toString() + " is included in the book list.");
    }

    if (books.contains(new Book("Object Oriented Programming in Java"))) {
      System.out.println(book1.toString() + " is included in the book list.");
    }

    System.out.println("Before remove");
    System.out.println(books);
    books.remove(new Book("Introduction of Classical Physics")); // call @Override .equals() method
    System.out.println("After remove");
    System.out.println(books);
    System.out.println();

  }

}
