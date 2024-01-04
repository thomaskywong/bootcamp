package practiselambda;

public class LambdaInterface {

  public static void main(String[] args) {
    
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtraction = (x, y) -> x - y;
    MathOperation multiplication = (x, y) -> x * y;
    MathOperation average = (x, y) -> (x + y) / 2;
    MathOperation max = (x, y) -> x >= y ? x : y;

    int a = 10;
    int b = 30;

    System.out.println(addition.compute(a, b));   // 40
    System.out.println(subtraction.compute(a, b)); // -30
    System.out.println(multiplication.compute(a, b)); // 300
    System.out.println(average.compute(a, b)); // 20
    System.out.println(max.compute(a, b)); // 30

  }

}