package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DemoArrayDeque {

  public static void main(String[] args) {

    // ArrayDeque.
    // poll head shall resize the Array structure.
    // peekLast is fast since direct access to the last element. While Deque needs to iterate from beginning
    // ArrayDeque can provide size

    Queue<String> qs = new ArrayDeque<>();

    // Implement Queue Interface
    // .add()
    qs.add("ABC");
    qs.add("ABC");
    qs.add("DEF");
    qs.add("GHI");

    System.out.println(qs.toString()); // ABC ABC DEF GHI JKL

    System.out.println(qs.peek()); // ABC. get the element at the beginning (ABC) without removing
    System.out.println(qs.toString()); // ABC ABC DEF GHI JKL

    System.out.println(qs.remove()); // ABC. get And remove the element at the beginning. return exception if empty
    System.out.println(qs.toString()); // ABC DEF GHI JKL

    System.out.println(qs.poll()); // ABC. get AND remove the element at the beginning. return null if empty

    Deque<String> dq = new ArrayDeque<>();

    // Implement Deque Interface
    dq.add("AAA"); // AAA
    dq.add("BBB"); // AAA BBB
    dq.addLast("CCC"); // AAA BBB CCC
    dq.addFirst("000"); // 000 AAA BBB CCC
    System.out.println(dq.toString());

    dq.removeFirst(); // get and remove 000
    System.out.println(dq.toString()); // AAA BBB CCC
    dq.removeLast(); // get and remove CCC
    System.out.println(dq.toString()); // AAA BBB



  }
}
