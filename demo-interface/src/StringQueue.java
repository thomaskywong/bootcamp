public class StringQueue implements Addable, Pullable {

  private String[] queue;

  public StringQueue() {
    this.queue = new String[0];
  }

  // interface method
  @Override
  public void add(String s) {
    this.addTail(s);
  }

  @Override
  public String pull() {
    return this.pullHead();
  }

  // Instance method. Use private to hide
  private String pullHead() {

    if (this.queue.length == 0) {
      return null;
    }

    String[] newArr = new String[this.queue.length - 1];

    String head = this.queue[0]; // check if point to null
    for (int i = 1; i < this.queue.length; i++) {
      newArr[i - 1] = this.queue[i];
    }
    this.queue = newArr;
    return head;
  }

  private void addTail(String s) {
    String[] newArr = new String[this.queue.length + 1];
    for (int i = 0; i < queue.length; i++) {
      newArr[i] = this.queue[i];
    }
    newArr[newArr.length - 1] = s;
    this.queue = newArr;
  }

  public String peak() { // read the head, not pull
    return this.queue[0];
  }

  public boolean isEmpty() {
    return this.queue.length == 0;
  }

  public void clear() {
    this.queue = new String[0];
  }

  public static void main(String[] args) {

    StringQueue sq = new StringQueue();
    System.out.println(sq.isEmpty());
    sq.add("hello");
    sq.add("ABC");
    System.out.println(sq.peak());

    System.out.println(sq.pull());
    System.out.println(sq.pull());
    System.out.println(sq.pull());
    System.out.println(sq.isEmpty());



  }


}
