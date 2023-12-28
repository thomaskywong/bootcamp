package box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

  private T t;

  // Compiler's no-arg constructor
  // public Box() {
  //
  // }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public static <T> Box<T> createBox(T value) {
    Box<T> box = new Box<>();
    box.setT(value);
    return box;
  }

  public static <U extends Shape> void xxx(U u) {
    u.area();
  }

  public static void addShape(List<Shape> ls, Shape shape) {
    ls.add(shape);
  }

  // compilation error by passing List<U>
  // public static <U extends Shape> void addShape2( List<U> ls, Shape shape) {
  // ls.add(shape); // List<T> cannot be passed
  // }

  // the pointer of list can be Shape object or any object that inherit the class Shape -> uncertain during runtime!
  // explicit casting to parent class is required.
  public static void addShape2(List<? extends Shape> ss, Shape shape) { 
    List<Shape> s2 = (List<Shape>) ss;
    s2.add(shape);
    System.out.println(s2.get(0).area());

  }

  // The pointer of list can only point to itself class object or its parent class object
  public static void addShape3(List<? super Shape> ss, Shape shape) {
    ss.add(shape);  // Circle(1.0) 
    List<Shape> s2 = (List<Shape>) ss;
    System.out.println(s2.get(ss.size()-1).area()); // 3.1415  
  }

  // Arguement with Object type that use generics will not work. complitation error when call calcualte(new Circle(3.0))

  // Example 1:
  // public static <T extends Shape> double calculate(Box<T> box) {
  // return box.getT().area();
  // }

  // Example 2:
  public static <T extends Box<Shape>> double calculate(T box) {
    return box.getT().area();
  }

  // Example 3: T extends something NOT Generic
  // public static <T extends Shape> double calculate(T shape) {
  // return shape.area();
  // }

  public static void main(String[] args) {
    // Example 1:
    // Box<Circle> circleBox = new Box<>(); // Box<Shape> and Box<Circle> are two difference type of reference for Generic T
    // Box<Circle> and Box<Shape> is not parent - child relationship! although Shape and Circle are Parent- Child relationship
    // System.out.println(Box.calculate(circleBox)); // compilation error

    // Example 2:
    Box<Shape> circleBox = new Box<>();
    circleBox.setT(new Circle(3.0));
    System.out.println(calculate(circleBox)); // pass same Box<Shape>
    

    // Example 3:
    // Shape circle1 = new Circle(3.0);
    // System.out.println(calculate(circle1)); // OK.

    // <? extends Shape> means if generic type extends Shape
    // check if the range of scope is the child of Shape
    List<? extends Shape> ls = new ArrayList<>();
    ls = new ArrayList<Circle>(); // OK, ls as type of reference can point to any List that contains any child object of Shape
    // Shape s = ls.get(0); // OK, since the return type of .get() is anything belong to Shape
    // Shape s2 = new Circle(3.0);
    // Shape s3 = new Shape();
    // ls.add(s2); // compilation error,
    // ls.add(s3); // compilation error, since ls type of reference is not certain
    // System.out.println(ls.get(0).area());

    // List<?> ls2 = new ArrayList<Object>(); // <?> means <? extends Object>
    // Object o2 = new Circle(3.0);
    // ls2.add(new Object());
    // ls2.add(new Circle(3.0));
    // ls2.add(o2); // compilation error
    // Object o = ls2.get(0);

    Shape s02 = new Shape();
    s02 = new Circle(3.0);
    System.out.println(s02.area());
    System.out.println();

    Shape s03 = new Circle(3.0);
    Circle c2 = (Circle) s03;
    System.out.println(c2.area());
    System.out.println();

    // test of  public static void addShape2(List<? extends Shape> ss, Circle shape) {}
    List<Circle> lc = new ArrayList<>();
    //lc.add(new Circle(3.0));
    Box.addShape2(lc, new Circle(3.0));
    Box.addShape2(lc, new Square(10));
    System.out.println();


    List<Shape> ld = new ArrayList<>();
    Box.addShape3(ld, new Circle(1.0));
    Box.addShape3(ld, new Square(10));


  }

}
