package practisecomparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Novel implements Comparable<Novel> {

  private String name;

  public Novel(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "name=" + this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) { 
      return true;
    }

    if (!(obj instanceof Novel)) {
      return false;
    }

    Novel novel = (Novel) obj;

    return Objects.equals(novel.getName(), this.name);
  }

  @Override 
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public int compareTo(Novel novel) {
    // return novel.getName().compareTo(this.name) > 0 ? -1 : 1;     // obj > this ? -1 : 1   accending (default)
    return novel.getName().compareTo(this.name) > 0 ? 1 : -1;  // obj > this ? 1: -1  decending
  }

  public static void main(String[] args) {

    List<Novel> novels = new LinkedList<>();
    novels.add(new Novel("ABCDE"));
    novels.add(new Novel("EFGHI"));
    novels.add(new Novel("CDEFG"));
    System.out.println(novels); // ABCDE, EFGHI, CDEFG

    // Collections.sort(List<T> list)
    Collections.sort(novels);
    
    System.out.println(novels); // ABCDE, CDEFG, EFGHI


  }

}
