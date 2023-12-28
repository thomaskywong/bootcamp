package practicegenerics1;

import java.math.BigDecimal;

public class SquareOf <T extends Number> {

  private T val;

  public SquareOf(T val) {
    this.val = val;
  }

  public void setVal(T val) {
    this.val = val;
  }

  public T getVal() {
    return this.val;
  }

  public double squareOf() {
    BigDecimal dVal = new BigDecimal(String.valueOf(this.val));
    return dVal.multiply(dVal).doubleValue();
  }

  
}
