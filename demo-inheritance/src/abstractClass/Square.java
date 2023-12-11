package abstractClass;

import java.math.BigDecimal;

public class Square extends Shape {

  private double length;

  public Square() {
    // super()
  }
  
  public Square(double length) {
    // super();       // implicitly called super()
    this.length = length;
  }

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }
  
  public static void main(String[] args) {
    
    Square square1 = new Square(3.4d, "RED");
    System.out.println(square1.area());
    System.out.println(square1.getColor());



  }


}
