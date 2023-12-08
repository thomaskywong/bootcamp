import java.util.Arrays;

public class Office {
  private Employee[] employees;
  private String location;

  // Constructor
  public Office(String location) {
      this.employees = new Employee[0];
      this.location = location;
  }

  // Setter
  public void setLocation(String location) {
    this.location = location;
  }

  public void addEmployee(Employee employee) {
    Employee[] newArr = Arrays.copyOf(employees, employees.length + 1);
    newArr[newArr.length-1] = employee;
    employees = newArr;
  }

  public boolean removeEmployee(int employeeId) {
    
    boolean isFound = false;
    int foundIndex = 0;

    for (int i = 0; i < employees.length; i++) {
      if (employeeId == employees[i].getEmployeeId()) {
        foundIndex = i;
        isFound = true;
      }
    }

    if (!isFound) {
      return false;
    }

    Employee[] newArr = new Employee[employees.length - 1];
    int index = 0;

    for (int i = 0; i < employees.length; i++ ) {
      if (foundIndex == i) {
        continue;
      }
      newArr[index++] = employees[i];
    }

    employees = newArr;

    return true;

  }

  // Getter
  public String getLocation() {
    return this.location;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");
    output.append("\nOffice Location: ").append(this.location);

    for (int i = 0; i < employees.length; i++) {
      output.append(employees[i].toString());
    }

    return output.toString();
  }




}
