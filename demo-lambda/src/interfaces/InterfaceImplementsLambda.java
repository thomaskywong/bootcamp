package interfaces;

public class InterfaceImplementsLambda {

  public static void main(String[] args) {
    
    Addition addition = new Addition();
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();

    int a = 10;
    int b = 30;
    System.out.println(Calculator.calculate(a, b, addition)); // 40
    System.out.println(Calculator.calculate(a, b, subtract)); // -20
    System.out.println(Calculator.calculate(a, b, multiply)); // 300

  }
  
}
