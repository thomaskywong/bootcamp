public class LinkedList {

  private Node head;

  public LinkedList() {

  }

  public void add(int value) {

    if (this.head == null) {
      this.head = new Node(value);
      return;
    }

    Node current = this.head;
    // while loop until tail, then setNext()
    while (current.next() != null) {
      current = current.next();
    }
    current.setNext(new Node(value));
  }

  public boolean remove(int value) {
    Node current = this.head;
    if (current == null) {
      return false;
    }
    while (current != null) {
      if (current.getVal() == value) {
        if (current.next() == null && current.prev() == null) {
          this.head = null;
          return true;
        }
        if (current.next() == null && current.prev() != null) {
          current.prev().setNext(null);
          return true;
        }
        if (current.next() != null && current.prev() == null) {
          this.head = current.next();
          current.next().setPrev(null);
        }
        if (current.next() != null && current.prev() != null) {
          current.prev().setNext(current.next());
          current.next().setPrev(current.prev());
        }
      }
      current = current.next();
    }
    return false;
  }

  public Node next() {
    if (this.head == null) {
      return null;
    }
    return this.head.next();
  }

  @Override
  public String toString() {

    if (this.head == null) {
      return "LinkedList[]";
    }

    StringBuilder output = new StringBuilder("LinkedList[");

    Node current = this.head;
    while (current != null) {
      output.append(current.getVal());
      current = current.next();
      if (current != null)
        output.append(", ");
    }
    output.append("]");

    return output.toString();

  }

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    System.out.println(list.toString());

    list.add(100);
    list.add(101);
    list.add(102);
    list.add(103);
    list.add(104);
    list.add(102);

    // LinkedList[100, 101, 102, 103, 104, 102]

    System.out.println(list.next().next().getVal()); // 102
    System.out.println(list.toString()); // LinkedList[100, 101, 102, 103, 104, 102]

    // .remove(int val)
    list.remove(102);
    System.out.println(list.toString()); // LinkedList[100, 101, 103, 104]
    list.remove(100);
    System.out.println(list.toString()); // LinkedList[101, 103, 104]
    list.remove(101);
    System.out.println(list.toString()); // LinkedList[103, 104]
    System.out.println(list.remove(104)); // true
    System.out.println(list.toString()); // LinkedList[103]
    System.out.println(list.remove(104)); // false
    System.out.println(list.toString()); // LinkedList[103]
    System.out.println(list.remove(103)); // true
    System.out.println(list.toString()); // LinkedList[]

    // System.out.println();
    // System.out.println(list.next().next().next().prev().getVal()); // 103

    // LinkedList list2 = new LinkedList();
    // list2.add(100);
    // System.out.println(list2.toString()); // LinkedList[100]
    // list2.remove(100);
    // System.out.println(list2.toString()); // LinkedList[]



  }

}
