import java.util.Objects;

public class Book {

  private String bookName;

  public Book(String bookName) {
    this.bookName = bookName;
  }

  public String getBookName() {
    return this.bookName;
  }

  @Override
  public String toString() {
    return this.bookName;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj){
      return true;
    }

    if (!(obj instanceof Book)) {
      return false;
    }

    Book book = (Book) obj;

    return Objects.equals(this.bookName, book.getBookName());

  }

  @Override
  public int hashCode(){
    return Objects.hash(this.bookName);
  }
  
}
