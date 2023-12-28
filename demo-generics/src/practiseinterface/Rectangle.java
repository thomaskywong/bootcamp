package practiseinterface;

import java.math.BigDecimal;

public class Rectangle implements CalculateArea {

  private double length;
  private double width;

  public Rectangle() {

  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public void of(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.width)).doubleValue();
  }




  
}
