public class DemoCircle {
  public static void main(String[] args) {

    Circle circle1 = new Circle(); // radius 0.0
    circle1.setRadius(3.2d);
    System.out.println("circle 1 radius = " + circle1.getRadius());
    System.out.println("circle 1 diameter = " + circle1.diameter());
    System.out.println("circle 1 Area = " + circle1.area());
    System.out.println();

    Circle circle2 = new Circle(); // radius 0.0
    circle2.setRadius(3.4d);
    System.out.println("circle 2 radius = " + circle2.getRadius());
    System.out.println("circle 2 diameter = " + circle2.diameter());
    System.out.println("circle 2 Area = " + circle2.area());
    System.out.println();

    // pass by reference
    circle2 = circle1;
    System.out.println("circle 2 radius = " + circle2.getRadius());
    System.out.println("circle 2 diameter = " + circle2.diameter());
    System.out.println("circle 2 Area = " + circle2.area());

    System.out.println();
    Circle c1 = new Circle(1.22);
    System.out.println("Radius = " + c1.getRadius());
    System.out.println("Area = " + c1.area());

    System.out.println();
    double radius3 = 2.0;
    System.out.println("Static Method Area:");
    System.out.println("Radius = " + radius3);
    System.out.println("Area = " + Circle.area(radius3));

  }
}
