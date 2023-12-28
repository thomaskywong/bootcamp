package shape2;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override 
  public String toString() {
    return "radius=" + this.radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Circle)) {
      return false;
    }

    Circle circle = (Circle) obj;

    return Objects.equals(circle.getRadius(), this.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius);
  }

  @Override 
  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

}
