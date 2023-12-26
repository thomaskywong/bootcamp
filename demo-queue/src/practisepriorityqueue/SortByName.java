package src.practisepriorityqueue;

import java.util.Comparator;

public class SortByName implements Comparator<Customer>{

  @Override
  public int compare(Customer c1, Customer c2) {
    return c2.getName().compareTo(c1.getName()) > 0 ? 1 : -1;  // decending order
  }
  
}
