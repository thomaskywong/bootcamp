package practisecomparable;

import java.util.Comparator;

public class SortById implements Comparator<Student>{

  @Override
  public int compare(Student s1, Student s2) {
     return s2.getId() > s1.getId() ? -1 : 1;
  }




  
}
