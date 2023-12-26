package comparableandcomparator.practisecomparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoEmployeeComparator {

  public static void main(String[] args) {
    
    // Instantiate Employee objects
    Employee e1 = new Employee("Thomas", LocalDate.of(2023, 1, 1));
    Employee e2 = new Employee("Keith", LocalDate.of(2013, 10, 1));
    Employee e3 = new Employee("Jerry", LocalDate.of(2015, 12, 30));

    // Instantiate comparator objects
    EmployeeSortByDate sortByDate = new EmployeeSortByDate();
    EmployeeSortByName sortByName = new EmployeeSortByName();

    List<Employee> employees = new ArrayList<>(List.of(e1, e2, e3));
    System.out.println(employees); // [name=Thomas, joinDate=2023-01-01, name=Keith, joinDate=2013-10-01, name=Jerry, joinDate=2015-12-30]

    // Collections.sort(List<T> list, Comparator<T> comparator)
    Collections.sort(employees, sortByDate);
    System.out.println(employees); // [name=Keith, joinDate=2013-10-01, name=Jerry, joinDate=2015-12-30, name=Thomas, joinDate=2023-01-01]

    Collections.sort(employees, sortByName);
    System.out.println(employees); // [name=Jerry, joinDate=2015-12-30, name=Keith, joinDate=2013-10-01, name=Thomas, joinDate=2023-01-01]



  }
  
}
