package practiselinkedlist;

public class LinkedList {

  private Node head;

  public LinkedList() {

  }

  public void add(int key, int val) {

    if (this.head == null) {
      this.head = Node.add(key, val);
    } else {
      Node pointer = this.head;
      while (pointer.getNext() != null) {
        pointer = pointer.getNext();
      }
      pointer.setNext(Node.add(key, val));
      pointer.getNext().setPrev(pointer);

    }


  }

  public Node get(int index) {
    if (this.head == null) {
      return null;
    }

    int counter = 0;
    Node current = this.head;

    while (counter++ < index) {
      current = current.getNext();
    }

    return current;
  }

  public int size() {
    if (this.head == null)
      return 0;
    int count = 0;
    Node pointer = this.head;

    while (pointer != null) {
      count++;
      pointer = pointer.getNext();
    }
    return count;
  }

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    list.add(1, 2);
    list.add(2, 4);
    list.add(3, 9);
    list.add(4, 15);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).toString());
    }

    System.out.println();
    System.out.println(list.get(0).getNext().toString());
    System.out.println(list.get(1).getPrev().toString());
    System.out.println(list.get(1).getNext().toString());
    System.out.println(list.get(2).getPrev().toString());
    System.out.println(list.get(2).getNext().toString());
    System.out.println(list.get(3).getPrev().toString());

    System.out.println(list.size());


  }



}
