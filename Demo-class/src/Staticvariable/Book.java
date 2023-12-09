package Staticvariable;

public class Book {

  // Attribute
  private String bookName;
  private String authorName;
  private int pageNumber;

  // Constructor
  public Book(String bookName, String authorName, int pageNumber) {
    this.bookName = bookName;
    this.authorName = authorName;
    this.pageNumber = pageNumber;
  }

  // Getter
  public String bookName() {
    return this.bookName;
  }

  public String authorName() {
    return this.authorName;
  }

  public int pageNumber(){
    return this.pageNumber;
  }

  public String getBookDetail() {
    StringBuilder output = new StringBuilder("");
    return output.append("\nBook Name: ").append(this.bookName)
      .append(", Author: ").append(this.authorName)
      .append(", Page number: ").append(this.pageNumber)
      .toString();
  }

  // Setter
   public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  } 

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }
  
  public static void main(String[] args) {
    
    Book book1 = new Book("Introduction of Calculus", "Newton", 200);
    Book book2 = new Book("Introduction of Chemistry", "Lewis", 350);
    Book book3 = new Book("English Poems", "Shakespeare", 500);

    System.out.println(book1.getBookDetail());
    System.out.println(book2.getBookDetail());
    System.out.println(book3.getBookDetail());



  }
  
}
