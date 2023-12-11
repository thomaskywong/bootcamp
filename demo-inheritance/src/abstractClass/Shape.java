package abstractClass;

import java.math.BigDecimal;

public abstract class Shape {

  // abstract class vs. class
  // Differences:
  // 1. cannot be "new"
  // 2. May contain abstract method(s). Implicitly public
  //
  // Same:
  // 1. Still have instance variables (attributes)
  // 2. Still have instance methods
  // 3. Still have static methods
  // 4. Must contain constructor, cannot be "new". for super() only

  private String color;

  // constructor
  public Shape() {

  }

  public Shape(String color) {
    this.color = color;
  }

  abstract double area(); // implicitly public. Do not write public, since implicityly public

  public String getColor() { // abstract class can have instance method
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static double totalArea(Shape[] shapes) {

    BigDecimal area = BigDecimal.valueOf(0.0d);

    // for (int i = 0; i < shapes.length; i++) {
    // area = area.add(BigDecimal.valueOf(shapes[i].area()));
    // }

    for (Shape shape : shapes) {
      area = area.add(BigDecimal.valueOf(shape.area()));
    }
    return area.doubleValue();
  }

  public static void main(String[] args) {

    Shape s1 = new Circle(3.2d, "YELLOW"); // polymorhism. Only Shape methods can be called during compile time.
    Shape s2 = new Square();

    System.out.println(s1.area()); // call Circle method
    System.out.println(s1.getColor()); // call Shape method
    //System.out.println(s1.getRadius); // Shape cannot call Circle method
    Circle c1 = new Circle();
    if (s1 instanceof Circle) {
      c1 = (Circle) s1; // Shape object down cast to child class object Circle
    }
    System.out.println(c1.getRadius());

    System.out.println();
    
    System.out.println(s2.area()); // call Square method
    System.out.println(s2.getColor()); // call Shape method
    System.out.println();

    Shape s3 = new Circle(1.0, "GREEN"); // polymorhism
    Shape s4 = new Square(2.0, "BLUE");

    System.out.println(s3.area()); // call Circle method
    System.out.println(s3.getColor()); // call Shape method
    System.out.println(s4.area()); // call Square method
    System.out.println(s4.getColor()); // call Shape method
    System.out.println();

    Shape[] shapes = new Shape[] {s1, s2, s3, s4};
    System.out.println(Shape.totalArea(shapes));

  }


}
