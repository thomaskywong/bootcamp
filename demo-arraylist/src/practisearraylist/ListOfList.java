package practisearraylist;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

  private List<List<Integer>> list;

  public ListOfList() {
    this.list = new ArrayList<>();
  }

  public void add(int key, int val) {
    if (this.list.size() < key) {
      for (int i = this.list.size(); i < key - 1; i++) {
        this.list.add(null);
      }
      this.list.add(new ArrayList<Integer>(List.of(val)));
    } else {
      this.list.set(key - 1, new ArrayList<Integer>(List.of(val)));
    }
  }

  public int get(int key) {
    if (this.list.size() < key) {
      return -1;
    }
    if (this.list.get(key - 1) != null)
      return this.list.get(key - 1).get(0);
    return -1;
  }

  public int remove(int key) {
    if (this.list.size() < key) {
      return -1;
    }
    if (this.list.get(key-1) != null ) {
      int removed = this.list.get(key - 1).get(0);
      this.list.set(key - 1, null);
      return removed;
    }
    return -1;
  }

  public static void main(String[] args) {

    ListOfList list = new ListOfList();

    list.add(1, 10); // [[1,10]]
    System.out.println(list.get(1)); // 10
    System.out.println(list.get(2)); // -1
    System.out.println(list.get(10)); // -1

    list.add(2, 50); // [[1,10],[2,50]]
    System.out.println(list.get(2)); // 50
    list.add(5, 100); // [[1,10],[2,50],[5,100]]
    list.add(10, 15); // [[1,10],[2,50],[5,100],[10,15]]

    System.out.println(list.get(1)); // 10
    System.out.println(list.get(2)); // 50
    System.out.println(list.get(3)); // -1
    System.out.println(list.get(4)); // -1
    System.out.println(list.get(5)); // 100
    System.out.println(list.get(6)); // -1
    System.out.println(list.get(7)); // -1
    System.out.println(list.get(8)); // -1
    System.out.println(list.get(9)); // -1
    System.out.println(list.get(10)); // 15
    System.out.println(list.get(11)); // -1

    System.out.println(list.remove(10)); // 15, [[1,10],[2,50],[5,100]]
    System.out.println(list.remove(11)); // -1, [[1,10],[2,50],[5,100]]
    System.out.println(list.remove(9)); // -1, [[1,10],[2,50],[5,100]]

    System.out.println(list.get(10)); // -1



  }

}


