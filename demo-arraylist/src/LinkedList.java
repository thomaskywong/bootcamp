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
    while (current != null) {
      if (current.getVal() == value) {
        current.prev().setNext(current.next());
        return true;
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
      return "[]";
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

    System.out.println(list.next().next().getVal()); // 102
    System.out.println(list.toString());

    // .remove(int val)
    list.remove(102);
    System.out.println(list.toString());


  }

}
