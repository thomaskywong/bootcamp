import java.math.BigDecimal;
import java.math.RoundingMode;

public class PractiseBigDecimal {

  public static void main(String[] args) {


    // new BigDecimal()
    BigDecimal bd01 = new BigDecimal(1.3333);
    System.out.println(bd01.doubleValue());

    // .valueOf()
    BigDecimal bd02 = BigDecimal.valueOf(2.33333);
    System.out.println(bd02.doubleValue());

    // .add()
    BigDecimal bd03 = bd01.add(bd02); // 1.3333 + 2.33333 = 3.66663. return a new BigDecimal Object
    System.out.println(bd03.doubleValue());

    // .subtract()
    bd03 = bd02.subtract(bd01); // 2.33333 + 1.3333 = 1.00003. return a new BigDecimal Object
    System.out.println(bd03.doubleValue());

    // .multiply()
    bd02 = BigDecimal.valueOf(3.0);
    bd01 = BigDecimal.valueOf(2.0);
    bd03 = bd02.multiply(bd01); // 3.0 x 2.0 = 6.0
    System.out.println(bd03.doubleValue());

    // .divide( BigDecimal object , decimal point, Roundingmode.HALF_UP)
    BigDecimal db1 = BigDecimal.valueOf(1.0);
    BigDecimal db2 = BigDecimal.valueOf(3.0);
    BigDecimal db3 = db1.divide(db2, 4, RoundingMode.HALF_UP); // division rounding up to 4th decimal points
    System.out.println(db3.doubleValue()); // 0.3333

    // .setScale( k decimal point, Roundingmode.HALF_UP)
    // rounding to kth decimal point
    BigDecimal db5 = BigDecimal.valueOf(Math.tan(Math.PI / 8));
    System.out.println(db5.setScale(4, RoundingMode.HALF_UP));

    // .doubleValue()
    // change BigDecimal to double value
    System.out.println(db3.doubleValue()); // 0.3333


    // .compareTo()
    // return 0 if two objects are equal. return 1 if bd1 > bd2, return -1 if bd1 < bd2 
    System.out.println(db1.compareTo(db2));     // -1
    System.out.println(db2.compareTo(db1));     // 1
    System.out.println(db1.compareTo(db1));     // 0

    // .equals()
    System.out.println(db1.equals(db1));     // true
    System.out.println(db2.equals(db1));     // false




  }

}
