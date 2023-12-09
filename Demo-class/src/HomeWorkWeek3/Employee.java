package HomeWorkWeek3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Employee {

  private int id;
  private StringBuilder name;
  private LocalDate dateOfEmployment;
  private Salary salary;
  private Payroll[] payrolls;
  private static int idCounter = 0;

  // constructor
  public Employee(String name, int year, int month, int day, double basicSalary,
      double hourlyRate) {
    this.id = ++idCounter;
    this.name = new StringBuilder(name);
    this.dateOfEmployment = LocalDate.of(year, month, day);
    this.salary = new Salary(basicSalary, hourlyRate);
    this.payrolls = new Payroll[0];
  }

  // setter
  public void setName(String name) {
    this.name = new StringBuilder(name);
  }

  public void setDateOfEmployment(int year, int month, int day) {
    this.dateOfEmployment = LocalDate.of(year, month, day);
  }

  // getter
  public int getId() {
    return this.id;
  }

  public StringBuilder getName() {
    return this.name;
  }

  public static int getIdCounter() {
    return idCounter;
  }

  // presenter
  public String payrollRecord(int year) {

    StringBuilder output = new StringBuilder("");

    for (int i = 0; i < payrolls.length; i++) {
      if (year == payrolls[i].getPayrollDate().getYear()) {
        output.append(payrolls[i].toString()).append("\n");
      }
    }
    return output.toString();
  }

  public String payrollRecord() {

    StringBuilder output = new StringBuilder("");

    for (int i = 0; i < payrolls.length; i++) {
      output.append(payrolls[i].toString()).append("\n");
    }
    return output.toString();
  }

  public BigDecimal calculateSalary() {
    return this.salary.monthlySalary();
  }

  public BigDecimal calculateSalary(double overTimeHour) {
    return this.salary.monthlySalary(overTimeHour);
  }

  public double highestPayroll() {

    double maxPayroll = 0;

    for (int i = -0; i < payrolls.length; i++){
      maxPayroll = Math.max(maxPayroll, payrolls[i].getTotalSalary().doubleValue());
    }

    return maxPayroll;

  }

  // modifier
  public void addPayroll(int year, int month, int day, BigDecimal totalSalary) {

    LocalDate payrollDate = LocalDate.of(year, month, day);
    Payroll payroll = new Payroll(payrollDate, totalSalary);
    Payroll[] newArr = Arrays.copyOf(this.payrolls, this.payrolls.length + 1);
    newArr[newArr.length - 1] = payroll;
    this.payrolls = newArr;
  }

  public boolean removePayroll(int year, int month) {
    int foundIndex = -1;
    boolean isFound = false;

    for (int i = 0; i < payrolls.length; i++) {
      if (year == payrolls[i].getPayrollDate().getYear()
          && month == payrolls[i].getPayrollDate().getMonthValue()) {
        foundIndex = i;
        isFound = true;
      }
    }

    if (!isFound) {
      return false;
    }

    int index = 0;
    Payroll[] newArr = new Payroll[payrolls.length - 1];

    for (int i = 0; i < payrolls.length; i++) {
      if (foundIndex == i) {
        continue;
      }
      newArr[index++] = payrolls[i];
    }
    payrolls = newArr;

    return true;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");

    output.append("ID: ").append(this.id)
        .append("\nName: ").append(this.name)
        .append("\nDate of employment: ").append(this.dateOfEmployment.toString())
        .append("\nSalary rate( ").append(this.salary.toString()).append(" )");
    
    return output.toString();
  }

  public static void main(String[] args) {

    Employee thomas = new Employee("Thomas Wong", 2023, 12, 1, 20000, 50);
    System.out.println("ID: " + thomas.getId()); // 1
    System.out.println("Name: " + thomas.getName()); // Thomas Wong
    System.out.println();

    System.out.println(thomas.toString());
    System.out.println();

    System.out.println("Static ID Counter: " + getIdCounter()); // 1
    System.out.println();

    thomas.setDateOfEmployment(2023, 11, 1);
    thomas.salary.salaryUpdate(30000, 60);
    System.out.println(thomas.toString());
    System.out.println();

    Employee yan = new Employee("Yan Wong", 2023, 12, 9, 18000, 50);
    System.out.println("ID: " + yan.getId()); // 2
    System.out.println("Name: " + yan.getName()); // Yan Wong
    System.out.println();

    System.out.println(yan.toString());
    System.out.println();

    System.out.println("Static ID Counter: " + getIdCounter()); // 2
    System.out.println();

    System.out.println("Empty payroll record.");
    System.out.println(thomas.payrollRecord());

    thomas.addPayroll(2023, 10, 1, thomas.calculateSalary());
    thomas.addPayroll(2023, 11, 1, thomas.calculateSalary(10));
    System.out.println(thomas.payrollRecord());

    thomas.addPayroll(2023, 12, 1, thomas.calculateSalary(20));
    System.out.println(thomas.payrollRecord());

    System.out.println("Delete 2023-12 record");
    thomas.removePayroll(2023, 12);
    System.out.println(thomas.payrollRecord());

    thomas.addPayroll(2023, 12, 1, thomas.calculateSalary(30));
    thomas.addPayroll(2024, 1, 1, thomas.calculateSalary());
    System.out.println(thomas.payrollRecord());

    System.out.println(thomas.toString());
    System.out.println("2023 payroll record");
    System.out.println(thomas.payrollRecord(2023));
    System.out.println();

    System.out.println(thomas.toString());
    System.out.println(thomas.payrollRecord());
    System.out.println("Highest monthly salary: " + thomas.highestPayroll());

  }

}


