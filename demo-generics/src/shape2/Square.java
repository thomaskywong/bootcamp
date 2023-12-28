package shape2;

import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape{

  private double length;

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override 
  public String toString() {
    return "length=" + this.length;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Square)) {
      return false;
    }

    Square square = (Square) obj;

    return Objects.equals(square.getLength(), this.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.length);
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }
  
}
