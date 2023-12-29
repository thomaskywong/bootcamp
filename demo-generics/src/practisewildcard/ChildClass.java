package practisewildcard;

public class ChildClass extends ParentClass {

  public ChildClass() {
    super("Child");
  }

  @Override
  public void method() {
    System.out.println("Child's method.");
  }

  public void method2() {
    System.out.println("Child's method2");
  }
  

}
