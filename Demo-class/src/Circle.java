import java.math.BigDecimal;

public class Circle {

  private double radius;      // default value 0.0

  // Constructor
  // Empty constructor
  public Circle() {}
  
  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }
  
  // setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // getter
  public double getRadius() {
    return this.radius;
  }

  public double diameter() {
    return this.radius * 2;
  }

  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  // Static Method - tools
  public static double area(double radius) {
    
    return BigDecimal.valueOf(radius)
      .multiply(BigDecimal.valueOf(radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
  }
  
}
