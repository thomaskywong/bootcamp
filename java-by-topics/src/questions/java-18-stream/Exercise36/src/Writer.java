package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Writer {

  private String name;
  private List<Book> books;

  public Writer(String name, List<Book> books) {
    this.name = name;
    this.books = books;

    this.sortByName();

  }

  public String getName() {
    return this.name;
  }

  public List<Book> getBooks() {
    return this.books;
  }

  public void addBook(Book book) {
    Objects.requireNonNull(book);

    this.books.add(book);
    this.sortByName();
  }

  private void sortByName() {
    Comparator<Book> sortByName =
        (x, y) -> y.getName().compareTo(x.getName()) > 0 ? -1 : 1;
    
    Collections.sort(this.books, sortByName);
  }

  @Override
  public String toString() {
    return "Writer(name=" + this.name + ", " + books.toString() + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Writer))
      return false;

    Writer writer = (Writer) obj;

    return Objects.equals(this.name, writer.getName())
        && Objects.equals(this.books, writer.getBooks());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.books);
  }

}
