public class Demo {

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();
    DemoStaticNestedClass.Calculator c =
        new DemoStaticNestedClass.Calculator(100);
    c.add(10);
    System.out.println(c.getX());

    Calculator calculator = new Calculator(200);
    calculator.add2(20);
    System.out.println(calculator.getX2());


  }
}
