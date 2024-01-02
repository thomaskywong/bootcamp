import lambda.Walkable;

public class DemoWalkableLambda implements Walkable {
  @Override
  public void walk() {
    System.out.println("A Person is walking..."); // most important code
  }

  // if more than one method in interface, @Override is required
  // public void run() {
  //
  // }

  public static void main(String[] args) {
    System.out.println("Hello World.");

    Walkable person = () -> System.out.println("A Person is walking...");

    person.walk();

  }


}
