package practiselambda;

import java.math.BigDecimal;

public class DemoLambda {
  public static void main(String[] args) {
   
    CalculateArea circle = r -> BigDecimal.valueOf(Math.PI).multiply(BigDecimal.valueOf(r)).multiply(BigDecimal.valueOf(r)).doubleValue();
    CalculateArea square = w -> BigDecimal.valueOf(w).multiply(BigDecimal.valueOf(w)).doubleValue();

    System.out.println(circle.area(10)); // 314.15
    System.out.println(square.area(20)); //400.0 

}

}