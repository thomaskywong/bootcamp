package HomeWorkWeek3;

import java.math.BigDecimal;

public class Salary {

  private BigDecimal basicSalary;
  private BigDecimal hourlyRate;

  // Constructor
  public Salary(double basicSalary, double hourlyRate) {
    this.basicSalary = BigDecimal.valueOf(basicSalary);
    this.hourlyRate = BigDecimal.valueOf(hourlyRate);
  }

  public Salary(double basicSalary) {
    this.basicSalary = BigDecimal.valueOf(basicSalary);
    this.hourlyRate = BigDecimal.valueOf(0.0d);
  }

  // setters
  public void setBasicSalary(double basicSalary) {
    this.basicSalary = BigDecimal.valueOf(basicSalary);
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = BigDecimal.valueOf(hourlyRate);
  }

  // getters
  public BigDecimal getBasicSalary() {
    return this.basicSalary;
  }

  public BigDecimal getHourlyRate() {
    return this.hourlyRate;
  }

  // modifier
  public void salaryUpdate(double basicSalary, double hourlyRate) {
    this.basicSalary = BigDecimal.valueOf(basicSalary);
    this.hourlyRate = BigDecimal.valueOf(hourlyRate);
  }
  // Calculator
  public BigDecimal monthlySalary(double overTimeHour) {
    
    BigDecimal hour = new BigDecimal(overTimeHour);
    return this.basicSalary.add(this.hourlyRate.multiply(hour));
  }

  public BigDecimal monthlySalary() {
    return this.basicSalary;
  }

  // presenter .toString()
  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");

    output.append("Basic salary = $ ").append(this.basicSalary)
      .append(", Hourly rate = $ ").append(this.hourlyRate).append(" per hour");

    return output.toString();
  } 

  public static void main(String[] args) {

    Salary salary = new Salary(10000, 50);
    System.out.println(salary.toString());

    salary.setBasicSalary(12000);
    salary.setHourlyRate(60);
    System.out.println("Basic Salary: " + salary.getBasicSalary());
    System.out.println("Hourly rate: " + salary.getHourlyRate());
    System.out.println("Salary: " + salary.toString());

    System.out.println("Total Salary: $ " + salary.monthlySalary(10));
  }
}
