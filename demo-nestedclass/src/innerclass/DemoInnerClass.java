package innerclass;

public class DemoInnerClass { // Outter class

  // private Calculator calculator;

  // public DemoInnerClass() {
    
  // }

  // public void setCalculator(Calculator calculator) {
  //   this.calculator = calculator;
  // }


  public class Calculator { // Inner class

    // private DemoInnerClass pointer;

    public Calculator() {
      
    }

  }

  public static void main(String[] args) {
    
    DemoInnerClass d = new DemoInnerClass();

    DemoInnerClass.Calculator c = d.new Calculator();

    DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator();

    

  }
  
}
