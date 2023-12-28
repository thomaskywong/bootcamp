package exception;
public class DemoUncheckedException {

  private double balance;

  public static void main(String[] args) {

    
    // Unchecked exception (Runtime exception)
    // 1. you do not need throw exception for runtime exception (unchecked exception)
    // 2. throw checked exception

    double result = 0.0d;
    // int result;
    // Example 2: double / double -> 10.0 / 0.0 -> NaN. NaN is NOT an exception. 

    try {
      result = divide(10.0d, 0.0d);
      //result = 0/0;
    } catch (ArithmeticException ex) {
      System.out.println("ArithmeticException");
      ex.getMessage();
      // result = 0;
      result = 0.0d;
    }

    //divide(3, 0); // 

  }

  public static double divide(double x, double y) throws ArithmeticException{
    if (y == 0) {
      throw new ArithmeticException("y cannot be 0");
    }

    return x/y; // potential runtime exception: arithmeticException
  }

  public boolean deposit (double amount) throws IllegalArgumentException {
    if (amount <= 0.0d) {
      throw new IllegalArgumentException();
    }
    this.balance += amount;
    return true;
  }
   
}
