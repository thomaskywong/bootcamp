package src;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output: 
 * Writer: Susan 
 * Writer: Tracy 
 * Book Name: Book A, Book Price: 34.9 
 * Book Name: Book B, Book Price: 78.9 
 * Book Name: Book C, Book Price: 104.9 
 * Book Name: Book D, Book Price: 449.9 
 * The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...

// Implement Wrtier Class
// Code here ...

// Implement a Comparator to compare the book price
// Code here ...

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book(34.9, "Book A"),
                new Book(78.9, "Book B"));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"),
                new Book(449.9, "Book D"));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
        List<String> writersName = writers.stream()
                                          .map(x -> x.getName())
                                          .collect(Collectors.toList());
        writersName.forEach(x -> System.out.println("Writer: " + x));

        // Use flatMap method to return all books written by our writers, storing in a List<Book>
        // Just return the Books!
        // Code here ...
        List<Book> listOfBooks = writers.stream()
                                        .flatMap(e -> e.getBooks().stream())
                                        .collect(Collectors.toList());      

        // Print out all books' Name and Price.
        // Code here
        listOfBooks.forEach(x -> System.out.println(x));

        // Create Comparator for stream max() method use, aims to find the most expensive book
        // Book maxPriceBook = ...

        // Comparator sortByPrice
        Comparator<Book> sortByPrice =
                (p1, p2) -> p2.getPrice() > p1.getPrice() ? 1 : -1;
        
        Book maxPriceBook = listOfBooks.stream()
                                       .sorted(sortByPrice)
                                       .findFirst()
                                       .get();

        
        // Print out the most expensive book
        System.out.println("The Most Expensive Book: Name:" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());

    }   
}
