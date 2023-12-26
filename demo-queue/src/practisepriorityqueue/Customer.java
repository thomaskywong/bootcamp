package src.practisepriorityqueue;

import java.util.Objects;

public class Customer implements Comparable<Customer>{

  private String name;

  public Customer(String name) {
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
  public int hashCode() {
    return Objects.hash(this.name);
  }
  
  @Override
  public int compareTo(Customer c) {
    return c.getName().compareTo(this.name) > 0 ? -1 : 1;
  }
}
