import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Collectors;

public class LinkedList1 {

  public static void main(String[] args) {

    List<Integer> list = new LinkedList<>();

    // .add(E element)
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);
    list.add(0);

    System.out.println(list); // 4, 3, 2, 1, 0
    System.out.println();

    // .remove(int index)
    System.out.println(list.remove(2)); // 2
    System.out.println(list); // 4, 3, 1, 0
    System.out.println();

    // .remove(Object object)
    System.out.println(list.remove(Integer.valueOf(4))); // true
    System.out.println(list); // 3, 1, 0
    System.out.println();

    // .add(int index, E element)
    list.add(0, 4);
    list.add(2, 2);
    System.out.println(list); // 4, 3, 2, 1, 0
    System.out.println();

    // .size()
    System.out.println(list.size()); // 5
    list.add(list.size(), -1);
    System.out.println(list); // 4, 3, 2, 1, 0, -1
    System.out.println();

    // .get(int index)
    System.out.println(list.get(1)); // 3
    // System.out.println(list.get(6)); // Throws exception - out of bound
    System.out.println(list.get(5)); // -1
    System.out.println();

    // .indexOf(Object obj)
    System.out.println(list.indexOf(0)); // 4
    System.out.println(list.indexOf(-1)); // 5
    System.out.println(list.indexOf(6)); // -1
    System.out.println();

    Deque<String> ll2 = new LinkedList<>();
    // LinkedList implements Deque interface and overrides Deque abstract methods

    // .addFirst(E element)
    ll2.addFirst("ABC");
    ll2.addFirst("TTT");
    System.out.println(ll2); // TTT ABC

    // .addLast(E element)
    ll2.addLast("AAA");
    ll2.add("BBB");
    // ll2.add(ll2.size(), "CCC"); // implements list
    // ll2.add(ll2.size(), "DDD"); // implements list
    System.out.println(ll2); // TTT ABC AAA BBB
    System.out.println();

    // E removeFirst();
    System.out.println(ll2.removeFirst()); // TTT
    System.out.println(ll2); // ABC AAA BBB
    System.out.println();

    // E removeLast();
    System.out.println(ll2.removeLast()); // BBB
    System.out.println(ll2); // ABC AAA
    System.out.println();

    // E peek() - get the first element
    // E peekFirst()
    System.out.println(ll2.peek()); // ABC
    System.out.println(ll2.peekFirst()); // ABC
    System.out.println();

    // E peekLast()
    System.out.println(ll2.peekLast()); // AAA
    System.out.println();

    // .offerFirst(E element)
    System.out.println(ll2.offerFirst("123")); // true
    System.out.println(ll2.offerFirst("456")); // true
    System.out.println(ll2); /// 456, 123, ABC, AAA

    // .offerLast(E element)
    System.out.println(ll2.offerLast("XXX")); // true
    System.out.println(ll2.offerLast("YYY")); // true
    System.out.println(ll2.offerLast("ZZZ")); // true
    System.out.println(ll2.offerLast("XXX")); // true
    System.out.println(ll2.offerLast("123")); // true
    System.out.println(ll2); // [456, 123, ABC, AAA, XXX, YYY, XXX, 123]
    System.out.println();

    // .removeFirstOccurance(Object obj)
    System.out.println(ll2.removeFirstOccurrence("123")); // true
    System.out.println(ll2); // [456, ABC, AAA, XXX, YYY, XXX, 123]
    System.out.println();

    // .removeLastOccurance(Object obj)
    System.out.println(ll2.removeLastOccurrence("XXX")); // true
    System.out.println(ll2); // [456, ABC, AAA, XXX, YYY, 123]
    System.out.println();

    System.out.println(ll2.size()); // 6
    System.out.println(ll2.isEmpty()); // false
    System.out.println();

    // .remove() - remove the head element
    System.out.println(ll2);
    System.out.println(ll2.remove());
    System.out.println(ll2);

  

  }

}
