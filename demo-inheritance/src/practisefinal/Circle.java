package practisefinal;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape{

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.PI)
           .multiply(BigDecimal.valueOf(this.radius))
           .multiply(BigDecimal.valueOf(this.radius))
           .doubleValue();
  }  

  @Override
  public String toString() {
    //System.out.printf("Length: %s, Width: %s\n", this.length, this.width);
    return "Radius: " + this.radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    
    if (!(obj instanceof Circle))
      return false;
    
    Circle circle = (Circle) obj;

    return Objects.equals(circle.getRadius(), this.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius);
  }

}
