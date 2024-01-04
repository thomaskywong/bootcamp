package interfaces;

public class Subtract implements MathOperation{

  @Override
  public int compute(int a, int b) {
    return a - b;
  }
  
}
