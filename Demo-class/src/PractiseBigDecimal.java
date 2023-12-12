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
    bd03 = bd02.subtract(bd01); // 2.33333 - 1.3333 = 1.00003. return a new BigDecimal Object
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
    // db1 = 1.0, db2 = 3.0
    System.out.println(".compareTo()");
    System.out.println(db1.compareTo(db2));     // -1
    System.out.println(db2.compareTo(db1));     // 1
    System.out.println(db1.compareTo(db1));     // 0

    // .equals()
    System.out.println();
    System.out.println(".equals()");
    System.out.println(db1.equals(db1));     // true
    System.out.println(db2.equals(db1));     // false

    System.out.println(bd01.divide(bd02, 0, RoundingMode.UP));

    // .remainder()
    BigDecimal bd11 = BigDecimal.valueOf(7.0d);
    BigDecimal bd12 = BigDecimal.valueOf(5.0d);
    System.out.println(bd11.remainder(bd12).doubleValue());   // 2.0

    System.out.println(bd11);
    System.out.println();

    BigDecimal bd111 = BigDecimal.valueOf(7.0d);
    BigDecimal bd112 = BigDecimal.valueOf(3.0d);
    BigDecimal result = bd111.divide(bd112, 2, RoundingMode.HALF_UP);     // 2.3333333 -> 2.33
    System.out.println(result.doubleValue());                            

    result = bd111.divide(bd112, 2, RoundingMode.DOWN);     // 2.33
    System.out.println(result.doubleValue());

    result = bd111.divide(bd112, 2, RoundingMode.UP);     // 2.34
    System.out.println(result.doubleValue());

    result = bd111.divide(bd112, 2, RoundingMode.HALF_UP);     // 2.0
    System.out.println(result.doubleValue());

    bd111 = BigDecimal.valueOf(2.0d);
    bd112 = BigDecimal.valueOf(3.0d);
    result = bd111.divide(bd112, 2, RoundingMode.HALF_UP);     // 0.666666 -> 0.67
    System.out.println(result.doubleValue());       // 0.67

    result = bd111.divide(bd112, 2, RoundingMode.UP);     // 0.666666 -> 0.67
    System.out.println(result.doubleValue());       // 0.67

    result = bd111.divide(bd112, 2, RoundingMode.DOWN);     // 0.666666 -> 0.66
    System.out.println(result.doubleValue());       // 0.66

  }

}
