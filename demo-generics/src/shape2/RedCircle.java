package shape2;

import java.math.BigDecimal;

public class RedCircle extends Circle {

  public RedCircle(double radius) {
    super(radius);
  }
  
  @Override 
  public double area() {
    return BigDecimal.valueOf(this.getRadius()).multiply(BigDecimal.valueOf(this.getRadius())).multiply(BigDecimal.valueOf(Math.PI)).multiply(BigDecimal.valueOf(2.0)).doubleValue();
  }
}
