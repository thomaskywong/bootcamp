package shape2;

import java.math.BigDecimal;
import java.util.List;

public class Shape {

  public double area() {
    return -1.0;
  }

  public static <T extends Shape> double totalArea(List<T> list) {

    BigDecimal totalArea = BigDecimal.valueOf(0.0d);

    for (T shape : list) {
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
    }

    return totalArea.doubleValue();
  }


  public static double totalArea2(List<Shape> list) { // only accept Shape as reference pointer

    BigDecimal totalArea = BigDecimal.valueOf(0.0d);

    for (Shape shape : list) {
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
    }

    return totalArea.doubleValue();
  }

  public static double totalArea3(List<? extends Shape> list) {

    BigDecimal totalArea = BigDecimal.valueOf(0.0d);

    for (Shape shape : list) {
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
    }

    return totalArea.doubleValue();
  }

  // public static double totalArea4(List<? super Shape> list) { // ? should be Shape or the parent of Shape (Object)

  // BigDecimal totalArea = BigDecimal.valueOf(0.0d);

  // for (Shape shape : list) { // compilation error. 
  // totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
  // }

  // return totalArea.doubleValue();
  //}

  // public static double totalArea4(List<? super Shape> list) { // ? could be Shape or parent of Shape

  //   BigDecimal totalArea = BigDecimal.valueOf(0.0d);

  //   for (Shape shape : list) { // compilation error. Object in list can be parent of Shape, which cannot be cast to child object!
  //     totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
  //   }

  //   return totalArea.doubleValue();
  // }

  public static double totalCircleArea(List<? super RedCircle> list) {

    BigDecimal result = BigDecimal.valueOf(0.0d);
    Circle circle;

    for (int i = 0; i < list.size(); i++) {
      circle = (Circle) list.get(i);
      result = result.add(BigDecimal.valueOf(circle.area()));
    }

    return result.doubleValue();

  }



  // public static void add(List<? super Shape> shapes, Shape shape) {
  // shapes.add(shape);
  // }


}
