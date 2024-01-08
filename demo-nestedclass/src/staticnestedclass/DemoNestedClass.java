public class DemoNestedClass {

  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass(200);
    DemoStaticNestedClass.Calculator c =
        new DemoStaticNestedClass.Calculator(100);
    c.add(10);
    System.out.println(c.getX());
    
    System.out.println("Normal top-most class");

    Calculator2 calculator = new Calculator2(200);
    calculator.add2(20);
    System.out.println(calculator.getX2());

    System.out.println("Nested Class");

    DemoStaticNestedClass.Calculator calculator2 = new DemoStaticNestedClass.Calculator(20);
    System.out.println(calculator2.getX());
    System.out.println(calculator2.scorePlusX());
  }
}
