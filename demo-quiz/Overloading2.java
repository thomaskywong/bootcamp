// package demo-quiz;

public class Overloading2 {

  public static int add(int x, int y) {
    return x + y;
  }

  public static double add(double a, double b) {
    return a - b;
  }

  public static double add(Double d1, Double d2) {
    return d1 * d2;
  }

  public static void main(String[] args) {
    System.out.println(add((int) 1.0, (int) 3.0));    // 4
    System.out.println(add(1.0, 3.0));    // -2.0
  }
  
}
