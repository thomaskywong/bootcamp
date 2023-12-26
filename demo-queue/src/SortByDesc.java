package src;

import java.util.Comparator;

public class SortByDesc implements Comparator<String> {

  @Override
  public int compare(String s1, String s2) {
    
    // System.out.printf("compare %s %s\n", s1, s2);
    // System.out.println(s2.compareTo(s1) > 0 ? 1 : -1);
    
    return s2.compareTo(s1) > 0 ? 1 : -1;

  }

  
}
