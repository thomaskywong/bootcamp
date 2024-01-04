package interfaces;

public class Addition implements MathOperation{

  @Override
  public int compute(int a, int b) {
    return a + b;
  }

}
