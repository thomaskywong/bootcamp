import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

  public static void main(String[] args) {
    LinkedList<String> ls = new LinkedList<>();
    ls.add("ABC");
    ls.add("XYZ");
    ls.add("IJK");

    System.out.println(ls); // [ABC, XYZ, IJK]

    ls.remove(); // remove first element. Only available in LiskedList
    System.out.println(ls); // [XYZ, IJK]
    ls.removeFirst(); // remove first element. Only available in LiskedList
    System.out.println(ls); // [IJK]
    ls.addFirst("DED"); // add element to the beginning
    System.out.println(ls); // [DED, IJK]
    ls.removeLast(); // remove last element. Only available in LinkedList
    System.out.println(ls); // [DED]


    List<String> ls2 = new LinkedList<>();
    ls2.add("ABC");
    ls2.add("XYZ");
    ls2.add("IJK");
    System.out.println(ls2);

    ls2.remove(2); // remove by index. ArrayList<> is faster than List<>
    System.out.println(ls2);

    ls2.remove("XYZ"); // remove by element. List<> is faster than ArrayList<>
    System.err.println(ls2);


    // for-each, contains(), isEmpty(), add(), remove()

    List<String> ls3 = new ArrayList<>(100); // capacity (array length) = 100 is reserved first
    System.out.println(ls3.size()); // size = 0 (how many elements)


  }

}
