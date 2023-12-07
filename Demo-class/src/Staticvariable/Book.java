package Staticvariable;

public class Book {

  // Attribute
  private String bookName;
  private String authorName;

  // Constructor
  public Book() {
    this.bookName = "";
    this.authorName = "";
  }

  public Book(String bookName, String authorName) {
    this.bookName = bookName;
    this.authorName = authorName;
  }

  // Getter
  public String bookName() {
    return this.bookName;
  }

  public String authorName() {
    return this.authorName;
  }

  public String getBookDetail() {
    return "\nBook Name: " + this.bookName + ", Author: " + this.authorName;
  }

  // Setter
   public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  } 
  
  
}
