package interfaces;

public class Multiply implements MathOperation{

  @Override
  public int compute(int a, int b) {
    return a * b;
  }
  
}
