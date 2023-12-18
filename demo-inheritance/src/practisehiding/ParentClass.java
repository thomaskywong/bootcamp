package practisehiding;

public class ParentClass {
  
  private static int num = 10;
  private static int num2 = 20;
  public static int num3 = 30;

  public static int getNum() {
    System.out.println("Calling parent's static method");
    return ParentClass.num;
  }

  public static int getNum2() {
    System.out.println("Calling parent's static method");
    return ParentClass.num2;
  }

}

