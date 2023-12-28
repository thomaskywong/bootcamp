package shape2;

import java.util.LinkedList;
import java.util.List;

public class DemoGenerics {

  public static void main(String[] args) {
    
    Square shape1 = new Square(1.0);
    Circle shape2 = new Circle(1.0);
    Square shape3 = new Square(3.0);
    Circle shape4 = new Circle(4.0);

    List<Shape> list = new LinkedList<>(List.of(shape1, shape2, shape3, shape4));
    List<Square> squares = new LinkedList<>(List.of(shape1, shape3));
    List<Circle> circles = new LinkedList<>(List.of(shape2, shape4));    
    
    System.out.println(Shape.totalArea(list)); // <T extends Shape> double totalArea(List<T>) can accept List<Shape>, List<Circle>, List<Square>
    System.out.println(Shape.totalArea(squares)); // List<T> can accept List<Square>
    System.out.println(Shape.totalArea(squares)); // List<T> can accept List<Square>

    System.out.println();
    System.out.println(Shape.totalArea2(list));  // totalArea2(List<Shape>) can only accept List<Shape>
    // System.out.println(Shape.totalArea2(squares)); // List<Shape> cannot accept List<Square>
    // System.out.println(Shape.totalArea2(circles)); // List<Shape> cannot accept List<Square>

    System.out.println();
    System.out.println(Shape.totalArea3(list));  // totalArea2(List<? extends Shape>) can List<Shape>, List<Circle>, List<Square>
    System.out.println(Shape.totalArea3(squares));  // totalArea2(List<? extends Shape>) can List<Shape>, List<Circle>, List<Square>
    System.out.println(Shape.totalArea3(circles));  // totalArea2(List<? extends Shape>) can List<Shape>, List<Circle>, List<Square>

    RedCircle shape5 = new RedCircle(1.0);
    RedCircle shape6 = new RedCircle(2.0);

    List<Circle> circles2 = new LinkedList<>(List.of(shape2, shape5));
    System.out.println(Shape.totalCircleArea(circles2));

  }
  
}
