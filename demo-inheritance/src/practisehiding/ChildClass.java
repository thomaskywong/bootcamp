package practisehiding;


public class ChildClass extends ParentClass {
  
  // hiding parent field. NOT RECOMMENDED! 
  private static int num = 5;
  public static int num3 = -30;

  // hiding parent static method
  public static int getNum() {
    System.out.println("Calling child's static method hiding parent's static method");
    return ChildClass.num;
  }

}
