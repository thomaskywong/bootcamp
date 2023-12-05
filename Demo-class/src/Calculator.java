import java.math.BigDecimal;

public class Calculator {

  private BigDecimal x;       
  private BigDecimal y;

  public Calculator(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public Calculator(double x, double y) {
    this.x = BigDecimal.valueOf(x);
    this.y = BigDecimal.valueOf(y);
  }

  public static Calculator of(double x, double y) {
    return new Calculator(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
  }

  public double add() {
    return this.x.add(this.y).doubleValue();
  }

  public double subtract() {
    return this.x.subtract(this.y).doubleValue();
  }

  public double multiply() {
    return this.x.multiply(this.y).doubleValue();
  }

  public double divide() {
    // return this.x.divide(this.y).doubleValue();
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator(BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.2));

    System.out.println(calculator.add());         // 0.3
    System.out.println(calculator.subtract());    // -0.1

    Calculator calculator2 = Calculator.of(1.5, 0.5);
    System.out.println(calculator2.add());        // 2.0
    System.out.println(calculator2.subtract());   // 1.0
    System.out.println(calculator2.multiply());   // 0.75


    Calculator calculator3 = Calculator.of(1.0, 3);
    System.out.println(calculator3.add());        // 4.0
    System.out.println(calculator3.subtract());   // -2.0
    System.out.println(calculator3.multiply());   // 3.0


  }
  
}
