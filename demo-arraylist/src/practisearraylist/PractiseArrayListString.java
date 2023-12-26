package practisearraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PractiseArrayListString {

  public static void main(String[] args) {

    // new ArrayList. use type of reference List<E>
    List<String> list = new ArrayList<>();

    // boolean add(E element)
    // add element to the end of ArrayList
    System.out.println(".add(E element)");
    list.add("AAA");
    list.add("BBB");
    list.add("CCC");

    // for each loop
    for (String item : list) {
      System.out.println(item); // AAA BBB CCC
    }

    System.out.println(list); // AAA BBB CCC
    System.out.println();

    // void add(int index, E element)
    // insert element at given index of ArrayList
    // throws exception if out of bound
    System.out.println(".add(int index, E element)");
    list.add(1, "AB");
    System.out.println(list); // AAA AB BBB CCC
    // list.add(5, "DDD"); // Runtime error. IndexOutOfBoundsException
    System.out.println("size of ArrayList = " + list.size());
    System.out.println("list.add(list.size(), \"DDD\")");
    list.add(list.size(), "DDD"); // appending element at the end of ArrayList is fine
    System.out.println(list); // AAA AB BBB CCC DDD
    System.out.println();

    // .remove(Object obj)
    // remove given obj from ArrayList and return true of successful
    System.out.println(".remove(E element)");
    System.out.println(list.remove("AB")); // true
    System.out.println(list.remove("EEE")); // false
    System.out.println(list); // AAA BBB CCC DDD
    System.out.println();

    // .remove(int index)
    // remove and return element from given index at index. Throws exception if out of bound
    System.out.println(".remove(int index)");
    System.out.println(list.remove(2)); // remove CCC
    System.out.println(list); // AAA BBB DDD
    // System.out.println(list.remove(3)); // outOfBoundsCheckIndex
    System.out.println();

    // .get(int index)
    // get and return element at index of ArrayList
    System.out.println(".get(int index)");
    System.out.println(list.get(0)); // AAA
    // System.out.println(list.get(3)); // throw exception. IndexOutOfBoundsException
    System.out.println();

    // .set(int index, E element)
    // assign element at index of ArrayList. return the original element that is replaced
    System.out.println(list.set(0, "ABC")); // return AAA
    System.out.println(list); // ABC BBB DDD
    System.out.println();

    // .size()
    // return size of ArrayList
    System.out.println(".size()");
    System.out.println(list.size()); // 3
    System.out.println();

    // .isEmpty()
    // return true if the ArrayList is empty. False if not empty
    System.out.println(".isEmpty()");
    System.out.println(list.isEmpty()); // false
    System.out.println();

    // .indexOf(Object object)
    // return index of ArrayList where contains the given object. return -1 if not found
    System.out.println(".indexOf(Object obj)");
    System.out.println(list.indexOf("DDD")); // 2
    System.out.println(list.indexOf("CCC")); // -1

    // .lastIndexOf(Object object)
    // return index of Arraylist where the given object last appears. return -1 if not found
    list.add("AAA");
    list.add("BBB");
    System.out.println(".lastIndexOf(Object obj)");
    System.out.println(list);
    System.out.print("list.lastIndexOf(\"AAA\") -> ");
    System.out.println(list.lastIndexOf("AAA")); // 3
    System.out.print("list.lastIndexOf(\"EEE\") -> ");
    System.out.println(list.lastIndexOf("EEE")); // -1

    // .subList(int start, int end)
    System.out.println(".subList(int start, int end)");
    System.out.println("list.subList(1,4)"); 
    List<String> list2 = list.subList(1,4);  // index 1 to 3
    System.out.println(list2); //  BBB DDD AAA

    // Iterator <E> iterator()
    // return iterator list of elements in ArrayList
    // boolean hasNext() - check if there is next item on iterator
    // <E> next() - return the element at the beginning of iterator
    System.out.println("Iterator<E> iterator() ");
    System.out.println("boolean hasNext()");
    System.out.println("<E> next()");
    System.out.println(list);
    Iterator<String> items1 = list.iterator();  

    while (items1.hasNext()) {
      System.out.print(items1.next() + " ");  /// ABC BBB DDD AAA BBB
    }
    System.out.println();

    // ListIterator <E> listIterator()
    // return iterator list of elements from given index in ArrayList
    System.out.println("ListIterator<E> listIterator(2) ");
    System.out.println("boolean hasNext()");
    System.out.println("<E> next()");
    System.out.println(list);
    Iterator<String> items2 = list.listIterator(2);
    while (items2.hasNext()) {
      System.out.print(items2.next() + " ");  // DDD AAA BBB
    }
    System.out.println();


    // ArrayList implements Collection Interface

    // .addAll(Collection collection)
    // Add given list of elements into ArrayList
    System.out.println("list.addAll(List.of(\"GGG\", \"HHH\", \"III\"))");
    List<String> l1 = new ArrayList<>(List.of("GGG", "HHH", "III"));
    list.addAll(l1);
    System.out.println(list); // ABC BBB DDD AAA BBB GGG HHH III
    System.out.println();

    // .addAll(int index, Collection collection)
    // add given list of elements into ArrayList
    System.out.println("list.addAdd(int index, Collection collection)");
    System.out.println("list.addAdd(1, l1)");
    list.addAll(1, l1);
    System.out.println(list); // ABC GGG HHH III BBB DDD AAA BBB GGG HHH III
    System.out.println();

    // .removeAll(Collection collection)
    // remove all elements in the given list from the ArrayList
    System.out.println("list.removeAll(l1)");
    list.removeAll(l1); // remove GGG HHH III
    System.out.println(list); // ABC BBB DDD AAA BBB
    System.out.println();

    // .retainAll(Collection collection)
    // retain all elements in the given list in the ArrayList and remove the rest
    System.out.println(list);
    System.out.println("list.retainAll(List.of(\"AAA\", \"DDD\"))");
    list.retainAll(List.of("AAA", "DDD")); // keeps AAA and DDD and remove the rest
    System.out.println(list); // DDD AAA
    System.out.println();

    // Object[] toArray()
    // converts the given list into Array of Object
    List<String> list01 = new ArrayList<>(List.of("ABC", "DEF", "GHI"));
    Object[] array = list01.toArray();
    for (Object item: array) {
      System.out.println(item.toString());  // ABC DEF GHI
    }

    // T[] toArray(T[] object)
    // converts the given list into Array of the same type of reference
    String[] arr = list01.toArray(new String[0]);
    System.out.println(Arrays.toString(arr)); //  [ ABC, DEF, GHI]

  }

}
