package practisefinal;

public class DemoShape {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle(1.0, 2.0);
    Square s1 = new Square(2.0);
    Circle c1 = new Circle(10.0);

    System.out.println(r1.area()); // 2.0
    System.out.println(s1.area()); // 4.0
    System.out.println(c1.area()); // 314.159265...

    // s1.setLength(4.0);
    // System.err.println(s1.area()); // 16.0
    // s1.setWidth(3);
    // System.err.println(s1.area()); // 9.0
    c1.setRadius(1.0);
    System.out.println(c1.area()); // 3.14159265...


    Shape.addShape(r1, s1, c1);
    System.out.println(Shape.totalArea()); // 2.0 + 4.0 + 3.14159.. = 9.14159

    System.out.println(r1.toString());

    Rectangle r2 = new Rectangle(1.0, 2.0);
    Rectangle r3 = new Rectangle(2.0, 1.0);
    System.out.println(r1.equals(r2)); // true
    System.out.println(r1.hashCode());
    System.out.println(r2.hashCode());
    System.out.println(r3.equals(r2)); // false
    System.out.println(r3.hashCode());

    Square s2 = new Square(2.0);
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

    Square s3 = new Square(1.5);
    System.out.println(s1.equals(s3)); // false
    System.out.println(s3.hashCode());

    System.out.println(s3.toString());

    c1.setRadius(2.0);
    Circle c2 = new Circle(2.0);
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.toString());

    c1.display();
    r1.display();

    Object c1a = c1;
    System.out.println(c1.getClass());
    System.out.println(c1a.getClass());

    Class<?> obj = r1.getClass();
    System.out.println(obj.getName());
    System.out.println(r1.getClass());

    


  }


}
