import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();

    // Map:
    // 1. key value pair -> <key, value> -> one entry
    // 2. key must be unique
    Map<String, Integer> ageBook = new HashMap<>();

    // put()
    System.out.println("V put(K key, V value)");
    ageBook.put("John", 20);
    ageBook.put("John", 13); // Update 20 -> 13, because "John" is the key which exists in the map
    ageBook.put("Mary", 3); // add a new entry

    System.out.println();
    System.out.println("int size()");
    System.out.println(ageBook.size()); // 2

    // Set<Map.Entry<String, Integer> entry = ageBook.entrySet();
    // Iteration over HashMap
    System.out
        .println("for(Map.Entry<String, Integer> entry : ageBook.entrySet()) ");
    for (Map.Entry<String, Integer> entry : ageBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    System.out.println();

    // V get(Object key)
    System.out.println("V get(Object key)");
    System.out.println(ageBook.get("Mary")); // 3
    System.out.println(ageBook.get("John")); // 13
    System.out.println(ageBook.get("John")); // 13
    System.out.println();


    Map<Integer, String> winnerBook = new HashMap<>();
    winnerBook.put(1, "Tommy");
    winnerBook.put(1, "Peter");
    winnerBook.put(2, "Sally");
    winnerBook.put(3, "Jenny");
    winnerBook.put(null, "AAA");
    winnerBook.put(null, "BBB");

    System.out.println("Iteration over HashMap");
    for (Map.Entry<Integer, String> entry : winnerBook.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    System.out.println();

    System.out
        .println("Set < Map.Entry<Integer,String> set = hashMap.entrySet()");
    Set<Map.Entry<Integer, String>> entry2 = winnerBook.entrySet();
    for (Map.Entry<Integer, String> entry : entry2) {
      System.out.println(entry);
    }
    System.out.println();

    // V get(Object key)
    System.out.println("V get(Object key)");
    System.out.println(winnerBook.get(null)); // BBB
    System.out.println(winnerBook.get(3)); // Jenny
    System.out.println();

    // Map<String, Book>
    Map<String, Book> bookMap = new HashMap<>();
    // put Book
    bookMap.put("John", new Book("ABC"));
    bookMap.put("John", new Book("IJK"));
    bookMap.put("Jenny", new Book("XYZ"));

    System.out.println("Iterate Map<String, Book> bookMap by .entrySet()");
    for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue().getBookName());
    }
    System.out.println();
    // get Book name
    System.out.println("V get(Object key), where V is Book");
    System.out.println(bookMap.get("Jenny").getBookName()); // XYZ
    System.out.println();
    // Map<Author, Book>

    System.out.println(
        "hashCode() in Book class shall be overriden to make HashMap .put to be functional");
    Map<Author, Book> bookStore = new HashMap<>();
    bookStore.put(new Author("John"), new Book("ABC"));

    // if there is no equals() & hashCode() -> new entry
    // if there are equals() & hashCode() -> update
    bookStore.put(new Author("John"), new Book("BCD"));

    System.out.println("Size of HashMap with duplicated key entries:");
    System.out.println(bookStore.size());
    // put() is not working without hashCode() or equals() method
    System.out.println();
    System.out.println("Value of key \"John\" is the value of the first entry");
    System.out.println(bookStore.get(new Author("John"))); // Book(name=BCD)
    // get() is not working without hashCode() or equals() method


    Author john = new Author("John");
    bookStore.put(john, new Book("ABC"));
    bookStore.put(john, new Book("BCD")); // if no equals() & hashCode() -> update
    System.out.println("bookStore.get(\"John\")");
    System.out.println(bookStore.get(john)); // Book(name=BCD)
    System.out.println();

    // boolean containsKey(Object key)
    System.out.println(bookStore);
    System.out.println("bookStore.containsKey(new Author(\"John\"):");
    System.out.println(bookStore.containsKey(new Author("John"))); // true
    System.out.println();

    // boolean containsValue(Object value)
    System.out.println("bookStore.containsValue(new Book(\"BCD\")):");
    System.out.println(bookStore.containsValue(new Book("BCD"))); // true
    System.out.println();

    System.out.println("V putIfAbsent(K key, V value)");
    System.out
        .println(bookStore.putIfAbsent(new Author("Ann"), new Book("IJK"))); // null
    System.out
        .println(bookStore.putIfAbsent(new Author("Ann"), new Book("CCC"))); // return value that is being in HashMap associated with the given key 
    System.out.println("get=" + bookStore.get(new Author("Ann"))); // IJK
    System.out.println();

    // bookStore.keySet()
    System.out.println("Set<K> keySet()");
    System.out.println(bookStore.keySet());
    System.out.println();

    // bookStore.values()
    System.out.println("Collection<V> values()");
    System.out.println(bookStore.values());
    System.out.println();


    // bookStore.remove(K key)
    // remove pairs with given key from HashMap
    System.out.println("V remove(K key)");
    System.out.println(bookStore.remove(new Author("Ann"))); // remove (Ann, IJK), return true of found, false if not found

    // bookStore.remove(K key, V value);
    System.out.println(bookStore.remove(new Author("John"), new Book("AAA"))); // nothing is removed. return false
    System.out.println(bookStore.remove(new Author("John"), new Book("BCD"))); // remove (John, BCD) return true

    System.out.println();
    bookStore.put(new Author("John"), new Book("ABC"));
    bookStore.put(new Author("Mary"), new Book("EFG"));
    System.out.println(bookStore);
    bookStore.clear();
    System.out.println(bookStore);


  }
}

