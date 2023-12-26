import java.util.Objects;

public class Author {

  private String authorName;

  public Author(String authorName) {
    this.authorName = authorName;
  }

  public String getAuthorName() {
    return this.authorName;
  }

  @Override 
  public String toString() {
    return this.authorName;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Author)) {
      return false;
    }

    Author author = (Author) obj;

    return Objects.equals(this.authorName, author.getAuthorName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.authorName);
  }
  
  
}
