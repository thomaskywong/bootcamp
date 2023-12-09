import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.annotation.processing.RoundEnvironment;

public class PractiseMath {

  public static void main(String[] args) {
  double d1 = 2.4d;
  double d2 = -2.4d;
  double d3 = 2.5d;

  // Math.abs(double d )
  System.out.println(Math.abs(d2));         // 2.4

  // Math.ceil(double d )
  System.out.println(Math.ceil(d1));        // 2.0

  // Math.floor(double d)
  System.out.println(Math.floor(d2));       // -3.0

  // Math.round(double d)
  System.out.println(Math.round(d1));       // 2, return int
  System.out.println(Math.round(d3));       // 3 
  
  // Math.max(double a, double b)
  System.out.println(Math.max(d3, d1));          // 2.5
  
  // Math.min(double a, double b)
  System.out.println(Math.min(d2, d1));         // -2.4

  // Math.pow(double a, double b)
  System.out.println(Math.pow(1.2, 2));          // 1.2 ^ 2 = 1.44

  // Math.sqrt(double a, double b)
  System.out.println(Math.sqrt(1.44));           // sqrt(1.44) = 1.2

  // Math.random()
  System.out.println(Math.random());            // generate random number from 0.0 - 1.0

  // Math.log(x) - natural log x 
  // k = exp(x)   -> x = log k
  System.out.println(Math.log(Math.E));         // log e (e) = 1.0

  // Math.log10()  - log10 x 
  // k = 10^(a) ->  a = log10 (k)
  System.out.println(Math.log10(100));          // log10(100) = 2.0

  // Final values
  // Math.PI = 3.1415....
  // Math.E = exp
  System.out.println( Math.PI );        // 3.141592...
  System.out.println( Math.E );        // 2.71828...
  System.out.println( BigDecimal.valueOf(Math.PI).setScale(4, RoundingMode.HALF_UP));        // 3.1416
  
  // Trigonometric functions
  // degree to radian
  System.out.println( Math.toRadians(180));         // 180 deg = PI

  // radian to degree
  System.out.println( Math.toDegrees(Math.PI/2));         // PI/2 = 90 deg

  // Math.sin(radian)
  System.out.println(Math.sin(Math.PI/2));                // sin(pi/2) = 1.0

  // Math.cos(radian)
  System.out.println(Math.cos(Math.PI));                  // cos(pi) = -1.0

  // Math.tan(radian)
  // tan(pi/4) = 1.0 ...0.999999999 precision loss
  System.out.println(Math.tan(Math.PI/4));                // tan(pi/4) = 1.0 ...0.999999999 precision loss
  System.out.println(BigDecimal.valueOf(Math.tan(Math.toRadians(45))));     // rounding to significant figures
       
                  



  }
}
