package practisefinal;

import java.util.Arrays;
import java.math.BigDecimal;

public abstract class Shape {

  private static Shape[] shapes = new Shape[0];

  abstract double area();

  public void display() {
    System.out.println("This is an abstract Shape class method");
  }
  
  public static boolean addShape(Shape... shapes) {

    if (shapes == null)
      return false;

    for (Shape shape : shapes) {
      Shape[] newArr = Arrays.copyOf(shapes, Shape.shapes.length + 1);
      newArr[newArr.length - 1] = shape;
      Shape.shapes = newArr;
    }
    return true;
  }

  public static double totalArea() {

    BigDecimal result = BigDecimal.valueOf(0);

    for (int i = 0; i < Shape.shapes.length; i++) {
      result = result.add(BigDecimal.valueOf(Shape.shapes[i].area()));
    }
    return result.doubleValue();
  }

}
