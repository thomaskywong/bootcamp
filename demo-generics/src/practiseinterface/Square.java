package practiseinterface;

import java.math.BigDecimal;

public class Square implements CalculateArea {

  private double length;

  public Square() {

  }

  public Square(double length) {
    this.length = length;
  }

  public void of(double length) {
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }

}
