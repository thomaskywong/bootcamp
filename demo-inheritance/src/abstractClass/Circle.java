package abstractClass;

import java.math.BigDecimal;

public class Circle extends Shape {

  private double radius;

  public Circle() {
    // super(); // calling Shape()
  }

  public Circle(double radius) {
    // super(); // calling Shape() by default! Can only inherit public members of parent class
    this.radius = radius;
  }

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    // BigDecimal rad = BigDecimal.valueOf(this.radius);
    // BigDecimal pi = BigDecimal.valueOf(Math.PI);
    // return rad.multiply(rad).multiply(pi).doubleValue();
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();

    // x.divide(y, 2, RoundingMode.HALF_UP)

  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {

    Circle circle = new Circle(3.4d, "RED");
    System.out.println(circle.area());
    System.out.println(circle.getColor());

    Circle circle2 = new Circle();
    System.out.println(circle2.area());
    System.out.println(circle2.getColor());
    circle2.setColor("BLACK");
    System.out.println(circle2.getColor());

    circle2.getColor();

    Shape s02 = (Shape) circle2;
    System.out.println( s02.getColor());



  }

}
