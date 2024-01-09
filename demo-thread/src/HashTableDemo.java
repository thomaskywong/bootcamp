import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

  public static void main(String[] args) {

    // HashTable - Thread-safe
    Map<Integer, String> hashTable = new Hashtable<>();

    Runnable addHashtable = () -> {
      System.out.println(Thread.currentThread().getId());
      for (int i = 0; i < 1_000_000; i++) {
        hashTable.put(i, "Hello");
      }
      System.out.println(Thread.currentThread().getId() + " ends.");

    };

    Runnable addHashtable2 = () -> {
      System.out.println(Thread.currentThread().getId());
      for (int i = 0; i < 1_000_000; i++) {
        hashTable.put(i + 1_000_000, "Hello");
      }
      System.out.println(Thread.currentThread().getId() + " ends.");

    };

    Thread thread1 = new Thread(addHashtable);
    Thread thread2 = new Thread(addHashtable2);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException ex) {

    }

    System.out.println(hashTable.size());

    // HashMap - not Thread-safe
    Map<Integer, String> hashMap = new HashMap<>();

    Runnable addHashMap = () -> {
      System.out.println(Thread.currentThread().getId());
      for (int i = 0; i < 1_000_000; i++) {
        hashMap.put(i, "Hello");
      }
      System.out.println(Thread.currentThread().getId() + " ends.");

    };

    Runnable addHashMap2 = () -> {
      System.out.println(Thread.currentThread().getId());
      for (int i = 0; i < 1_000_000; i++) {
        hashMap.put(i + 1_000_000, "Hello");
      }
      System.out.println(Thread.currentThread().getId() + " ends.");

    };

    Thread thread3 = new Thread(addHashMap);
    Thread thread4 = new Thread(addHashMap2);

    thread3.start();
    thread4.start();

    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException ex) {

    }

    System.out.println(hashMap.size());


  }

}
