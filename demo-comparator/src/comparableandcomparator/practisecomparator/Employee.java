package comparableandcomparator.practisecomparator;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

  private String name;
  private LocalDate joinDate;

  public Employee(String name, LocalDate joinDate) {
    this.name = name;
    this.joinDate = joinDate;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  @Override
  public String toString() {
    return "name=" + this.name + ", joinDate=" + this.joinDate;
  }  

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Employee)) {
      return false;
    }

    Employee employee = (Employee) obj;

    return Objects.equals(employee.getName(), this.name) 
           && Objects.equals(employee.getJoinDate(), this.joinDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.joinDate); 
  }
  


  
}
