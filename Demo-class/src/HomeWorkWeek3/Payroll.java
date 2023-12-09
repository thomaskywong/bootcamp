package HomeWorkWeek3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payroll {

  private LocalDate payrollDate;
  private BigDecimal totalSalary;

  // Constructor
  public Payroll(LocalDate payrollDate, BigDecimal totalSalary) {
    this.payrollDate = payrollDate;
    this.totalSalary = totalSalary;
  }

  // setter
  public void setPayrollDate(LocalDate payrollDate) {
    this.payrollDate = payrollDate;
  }

  public void setTotalSalary(BigDecimal totalSalary) {
    this.totalSalary = totalSalary;
  }

  // getter
 public LocalDate getPayrollDate() {
    return this.payrollDate;
  }

  public BigDecimal getTotalSalary() {
    return this.totalSalary;
  }

  // modifier
  public void setPayroll(LocalDate PayrollDate, BigDecimal totalSalary) {
    this.payrollDate = PayrollDate;
    this.totalSalary = totalSalary;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("");

    output.append("Payroll Date: ").append(this.payrollDate)
      .append(", Monthly salary = $ ").append(this.totalSalary);

    return output.toString();
  }

  public static void main(String[] args) {
    
    Payroll payroll = new Payroll(LocalDate.of(2023, 12, 01), new Salary(10000, 50).monthlySalary(10));
    System.out.println(payroll.toString());
    
    Salary salary = new Salary(20000);

    payroll.setPayrollDate(LocalDate.now());
    payroll.setTotalSalary(salary.monthlySalary());
    System.out.println(payroll.getPayrollDate());
    System.out.println(payroll.getTotalSalary());
    System.out.println(payroll.toString());

  }

}
