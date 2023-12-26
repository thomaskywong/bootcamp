package src;

// import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {

    // PriorityQueue extends Queue only
    Queue<String> qs = new PriorityQueue<>();

    // .add(E element) every added element will be sorted
    qs.add("hello");
    qs.add("a");
    qs.add("x");

    System.out.println(qs);

    // Constructor injection
    Queue<String> qs2 = new PriorityQueue<>(new SortByDesc());
    // Queue<String> qs2 = new PriorityQueue<>();
    qs2.add("d");
    qs2.add("b");
    qs2.add("c");
    qs2.add("a");

    int size = qs2.size();
    
    System.out.println(qs2.size());
    for (int i = 0; i < size; i++) {
      System.out.print(qs2.poll() + " ");
    }

  }
}
