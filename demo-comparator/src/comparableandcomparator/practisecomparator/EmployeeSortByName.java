package comparableandcomparator.practisecomparator;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{
  
  @Override
  public int compare(Employee o1, Employee o2) {
    return o2.getName().compareTo(o1.getName()) > 0? -1 : 1; //accending. Use String compareTo method
  }
  
}
