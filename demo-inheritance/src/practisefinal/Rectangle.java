package practisefinal;

import java.math.BigDecimal;
import java.util.Objects;


public class Rectangle extends Shape{

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public final double area() {   // Override abstract class method area
    BigDecimal bLength = BigDecimal.valueOf(this.length); // upcast to parent class object
    BigDecimal bWidth = BigDecimal.valueOf(this.width);  // upcast to parent class object

    return bLength.multiply(bWidth).doubleValue();
  }  

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  @Override
  public String toString() {
    //System.out.printf("Length: %s, Width: %s\n", this.length, this.width);
    return "Length: " + this.length + ", Width: " + this.width;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    
    if (!(obj instanceof Rectangle))
      return false;
    
    Rectangle rectangle = (Rectangle) obj;

    return Objects.equals(rectangle.getLength(), this.length)
        && Objects.equals(rectangle.getWidth(), this.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.length, this.width);
  }

  
}
