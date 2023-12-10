public class PractiseStatic {

  // Static variable are commonly share variable for all objects
  // static variable can be accessed without instantiate an object.
  // use ClassName.staticVariable to access static variable
  // can be modified by static method.
  // Once the value of static variable is changed, this is effective to all objects

  // Static method is method that can be used as public tool without instantiate an object
  // use ClassName.staticMethod() to call static method

  private static int counter = 0;
  private String name;

  public PractiseStatic(String name) {
    this.name = name;
    PractiseStatic.counter++;
  }

  public int getCounter() {
    return PractiseStatic.counter;
  }

  public String getName() {
    return this.name;
  }

  public static void setCounter(int value) {
    PractiseStatic.counter = value;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName() + ", Counter = " + this.getCounter();
  }

  public static void main(String[] args) {

    PractiseStatic obj1 = new PractiseStatic("Thomas");
    System.out.println(obj1.toString()); // static counter = 1

    PractiseStatic obj2 = new PractiseStatic("Yan");
    System.out.println(obj2.toString()); // static counter = 2 for obj1
    System.out.println(obj1.toString()); // static counter = 2 for obj2 as well

    // call static method using classname
    PractiseStatic.setCounter(50);
    System.out.println(obj2.toString()); // static counter = 50 for obj1
    System.out.println(obj1.toString()); // static counter = 50 for obj2 as well

    System.out.println(obj1.getCounter()); // static counter = 50 for obj1



  }

}
