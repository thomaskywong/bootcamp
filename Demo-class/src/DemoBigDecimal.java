import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

  public static void main(String[] args) {
    double d = 0.1 + 0.2;
    System.out.println("d = " + d); // precision loss during operation -> 0.30000000000000004

    if (d > 0.3)
      System.out.println("d > 0.3 = " + (d > 0.3)); // 0.3 is NOT > 0.3, should be false
    System.out.println();

    // BigDecimal is used to do arithmatic operation on double
    BigDecimal bd1 = new BigDecimal("0.1"); // String convert to char[]. Not recoomanded!
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // use Double.toString(val) -> convert to String

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue());

    BigDecimal bd4 = bd3.subtract(bd1);
    System.out.println(bd4.doubleValue());

    double s2 = 0.3 - 0.1;
    System.out.println(s2); // use double cause precision loss

    BigDecimal b1 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println(b1.doubleValue());

    System.out.println(
        BigDecimal.valueOf(1.2).add(BigDecimal.valueOf(1.1)).doubleValue());

    // multiply: 0.1 * 0.2
    double d2 = 0.1 * 0.2;
    System.out.println(d2); // error

    BigDecimal db02 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println(db02.doubleValue());

    // divide: 0.3 / 0.1
    double d3 = 0.3 / 0.1;
    System.out.println(d3); // error

    BigDecimal db03 = BigDecimal.valueOf(1.0).divide(BigDecimal.valueOf(3), 4,
        RoundingMode.DOWN);
    System.out.println(db03.doubleValue());

    System.out.println(sum(0.1, 0.2));

    // .CompareTo()
    BigDecimal a1 = BigDecimal.valueOf(0.2);
    BigDecimal a2 = BigDecimal.valueOf(0.2);
    BigDecimal a3 = BigDecimal.valueOf(0.1);
    System.out.println(a1.compareTo(a2) == 0); // true
    System.out.println(a1.compareTo(a3)); // 1 , since 0.2 > 0.1
    
    // .equals()
    System.out.println(a1.equals(a2));      // true

    BigDecimal roundingBigDecimal = BigDecimal.valueOf(10)
        .divide(BigDecimal.valueOf(3), 4, RoundingMode.DOWN)    // 3.3333
        .add(BigDecimal.valueOf(5.0))   // 8.3333
        .subtract(BigDecimal.valueOf(2.1)) // 6.2333
        .setScale(2, RoundingMode.DOWN); // 6.23

    System.out.println(roundingBigDecimal); // 6.23


  }

  public static double sum(double d1, double d2) {
    return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
  }

}
