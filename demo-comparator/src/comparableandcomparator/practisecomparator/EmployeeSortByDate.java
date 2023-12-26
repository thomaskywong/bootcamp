package comparableandcomparator.practisecomparator;

import java.util.Comparator;

public class EmployeeSortByDate implements Comparator <Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    
    return o2.getJoinDate().compareTo(o1.getJoinDate()) > 0 ? -1 : 1;

  }
  
}
