package exception;

public class DemoMultipleMethod {

  public static void main(String[] args) {
    // Difference of throwing checked or unchecked exception
    // 1. For Checked Exception. you have to handle it by try-catch at the end.
    // 2. For Unchecked Exception or Runtime Exception, you have to either program fix to "avoid"
    //    or agree to "accept" the risk.
    // 3. For checked/ unchecked, there is still polymophism between parent and child exception

    // try catch
    try {
      System.out.println(methodA(5, 5));
    } catch (Exception ex) {   
      if (ex instanceof IllegalArgumentException) {
        System.out.println("IllegalArgumentException!");
      }
      System.out.println(ex.getMessage());
    }
  }

  public static int methodA(int x, int y) throws Exception {
    try {
      return methodB(x, y);
    } catch (RuntimeException ex) {
      throw ex;
    }
  }

  public static int methodB(int x, int y) throws RuntimeException{
    try {
      return methodC(x, y);
    } catch (IllegalArgumentException ex) {
      throw ex;
    }
  }

  public static int methodC(int x, int y) throws IllegalArgumentException {
    // what is the difference of throwing checked or unchecked exception in methodC?
    if (x + y > 10) 
      return x + y;
    throw new IllegalArgumentException("x + y should be > 10");
  }

  
}
