package practisewildcard;

public class ParentClass {

  private String name;

  public ParentClass() {
    this.name = "Parent";
  }

  public ParentClass(String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void method() {
    System.out.println("Parent's method.");
  }

  @Override
  public String toString() {
    return "name=" + this.name;
  }

}
