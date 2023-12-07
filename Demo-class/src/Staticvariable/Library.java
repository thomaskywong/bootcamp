package Staticvariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private static Librarian librarian;

  private Book[] books;

  public Library(Librarian librarian) {
    this.books = new Book[0];
    Library.librarian = librarian;
  }

  // add book
  public Book addBook(Book book) {
    bookCounter++;
    Book[] newArr = Arrays.copyOf(this.books, this.books.length + 1);
    newArr[this.books.length] = book;
    books = newArr;
   
    return book;
  }

  // List out all books of a library
  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");
    output.append("\nLibrarian: ").append(librarian.getName());
    output.append("\nNumber of books: ").append(String.valueOf(bookCounter));

    for (int i = 0; i < books.length; i++) {
      output.append("\nBook ").append(String.valueOf(i+1)).append(": ")
        .append(books[i].getBookDetail());
    }
    return output.toString();
  } 

  // instance method can access static variable
  public int bookCount() {
    return bookCounter;
  }

  public Librarian getLibrarian() {
    return librarian;
  }

  public static void main(String[] args) {

    Librarian librarian1 = new Librarian("Thomas");
    System.out.println(librarian1.getName());       // Thomas

    Library library1 = new Library(librarian1);
    Library library2 = new Library(librarian1);

    System.out.println(library1.getLibrarian().getName());    // Thomas
    System.out.println(library2.getLibrarian().getName());    // Thomas

    // create new Library with different librarian assign to "static" librarian
    // librarian of all libraries will be modified

    Librarian librarian2 = new Librarian("Jenny");
    Library library3 = new Library(librarian2);
    System.out.println(library3.getLibrarian().getName());    // Jenny
    System.out.println(library1.getLibrarian().getName());    // Jenny
    System.out.println(library2.getLibrarian().getName());    // Jenny    
    System.out.println(library3.toString());


    Book book1 = new Book("Introduction of Calculus", "Newton");
    Book book2 = new Book("Introduction of Chemistry", "Lewis");
    Book book3 = new Book("English Poems", "Shakespeare");


    Library library4 = new Library(librarian1);
    library4.addBook(book1);
    library4.addBook(book2);
    library4.addBook(book3);
    System.out.println(library4.toString());


  }
  
}
