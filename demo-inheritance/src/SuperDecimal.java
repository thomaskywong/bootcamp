import java.math.BigDecimal;

// BigDecimal is not a "final" class (No "final" keyword), so SuperDecimal can inherit it.
// final class canoot be inherited by other class
public class SuperDecimal extends BigDecimal {  

  // Optional empty constructor
  public SuperDecimal() {
    super("0.0");
  }

  // Constructor
  public SuperDecimal(double value) {
    super(String.valueOf(value));       // new BigDecimal("3.0") call parent class constructor to inherit the attributes 
  }


  public static SuperDecimal valueOf(double value) {
      return new SuperDecimal(value);
  }

  // @Override
  // public SuperDecimal multiply(SuperDecimal num) {
  //   return (SuperDecimal) this.multiply(num);
  // }
  
  public final SuperDecimal multiply(SuperDecimal value) {    // final method cannot be overriden by child class
    BigDecimal bd = this;   // up cast from child object to parent object is allowed
    BigDecimal bdValue = value; // up cast
    return new SuperDecimal(bd.multiply(bdValue).doubleValue()); 
  }
  
  public static void main(String[] args) {
    // SuperDecimal sd = new SuperDecimal();   // calling BigDecimal() constructor

    // 3.0 x 4.0
    // Inherit all BigDecimal public instance methods (cannot inherit private or static methods)
    SuperDecimal sd2 = new SuperDecimal(3.0);   // calling BigDecimal() constructor
    SuperDecimal sd3 = SuperDecimal.valueOf(4.0);
    //SuperDecimal sd5 = new SuperDecimal(sd2.multiply(sd3).doubleValue());
    SuperDecimal sd5 = sd2.multiply(sd3);
    System.out.println( sd5.doubleValue() );

    BigDecimal bd1 = (BigDecimal) sd5;
    System.out.println( bd1.doubleValue() ); // (double) bd1




  }
  
}
