import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PractiseHashSet {

  public static void main(String[] args) {

    HashSet<Integer> hs = new HashSet<>();

    // boolean add(E e)
    System.out.println(".add(E)");
    System.out.println(hs.add(1)); // true
    System.out.println(hs.add(2)); // true
    System.out.println(hs.add(1)); // false

    for (Integer item : hs) {
      System.out.println(item); // 1 2
    }
    System.out.println();

    // boolean remove(Object obj)
    System.out.println(".remove(Object)");
    System.out.println(hs.remove(2)); // true
    System.out.println(hs.remove(3)); // false. 3 does not exist

    for (Integer item : hs) {
      System.out.println(item); // 1
    }
    System.out.println();

    // boolean addAll(List l)
    System.out.println(".addAll(List)");
    List<Integer> ls = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
    System.out.println(hs.addAll(ls)); // true
    System.out.println(hs.addAll(ls)); // false. already in HashSet

    for (Integer item : hs) {
      System.out.println(item); // 1, 2, 3, 4, 5, 6
    }
    System.out.println();

    // boolean contains(Object obj)
    System.out.println(".contains(Object)");
    System.out.println(hs.contains(1)); // true
    System.out.println(hs.contains(7)); // false
    System.out.println();

    // boolean isEmpty()
    System.out.println(".isEmpty()");
    System.out.println(hs.isEmpty()); // false
    System.out.println();
    
    // void clear()
    System.out.println(".clear()");
    hs.clear();  
    System.out.println(hs.isEmpty()); // true



  }

}
