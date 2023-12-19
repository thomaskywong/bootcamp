public class Node {

  private int val;

  private Node prev;

  private Node next; // stores object reference of another Node object

  private Node(int val, Node prev, Node next) {
    this.val = val;
    this.prev = prev;
    this.next = next;
  }

  public Node(int val) {
    this.val = val;
  }

  public Node next() {
    return this.next;
  }

  public Node prev() {
    return this.prev;
  }

  public void setNext(Node next) {
    this.next = next;
    next.setPrev(this);
  }

  private void setPrev(Node prev) {
    this.prev = prev;
  }

  // public Node getNode() {
  // return this.node;
  // }

  public int getVal() {
    return this.val;
  }

  public int getEndVal() {
    if (this.next != null) {
      return this.next.getEndVal();
    }
    return this.getVal();
  }

  public static void main(String[] args) {

    Node head = new Node(100);
    Node node1 = new Node(101);

    head.setNext(node1);
    node1.setNext(new Node(102));

    System.out.println(head.next().next().getVal()); // 102
    System.out.println(head.getEndVal()); // 102

    System.out.println(head.next().next().prev().getVal()); // 101


  }



}
