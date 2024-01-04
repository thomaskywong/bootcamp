package src;

import java.util.Objects;

public class Book {

  private String name;
  private double price;

  public Book(double price, String name) {
    this.name = name;
    this.price = price;
  }
  
  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Book(Name=" + this.name + ", Price=" + this.price + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    
    if (!(obj instanceof Book))
      return false;

    Book book = (Book) obj;

    return Objects.equals(this.name, book.getName()) 
           && Objects.equals(this.price, book.getPrice());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.price);
  }

}
