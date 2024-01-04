package interfaces;

public class Calculator {


  // Method injection
  public static int calculate(int a, int b, MathOperation calculator) {
    return calculator.compute(a, b);
  }
  
}
