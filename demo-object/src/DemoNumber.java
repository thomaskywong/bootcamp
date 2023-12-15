import java.math.BigInteger;

public class DemoNumber {

  public static void main(String[] args) {
    Float f1 = Float.valueOf(1.2f);

    // Number n1 = new Number(1);// Number is abstract class. cannot be instantiate
    Number n1 = f1; // upcast
    System.out.println(n1.shortValue()); // 1

    Float f2 = Float.valueOf(60_000f);
    System.out.println(f2.shortValue()); // -5536 (Overflow 60000 - 32766 = 5536)
    System.out.println();

    // Long, Short, Byte, Integer, Float, Double
    // 1 and 2 auto box to Integer
    BigInteger bi1 = add(1, 2);
    System.out.println("result = " + bi1);
    System.out.println();
    BigInteger bi2 = add((short) 2, 5L);
    System.out.println("result = " + bi2);
  }

  // public static Number add(Integer x, Integer y) {
  // return 2;
  // }
  public static BigInteger add(Number x, Number y) {
    long lx = 0L;
    if (x instanceof Long) {
      System.out.println("instanceof Long");
      lx = (Long) x; // int -> Integer by autobox -> Long by casting, then auto unboxing to long
    } else if (x instanceof Short) {
      System.out.println("instanceof Short");
      lx = (Short) x; // auto unbox -> upcast
    } else if (x instanceof Byte) {
      System.out.println("instanceof Byte");
      lx = (Byte) x; // auto unbox -> upcast
    } else if (x instanceof Integer) {
      System.out.println("instanceof Integer");
      lx = (Integer) x; // auto unbox -> upcast
    }

    long ly = 0L;
    if (y instanceof Long) {
      System.out.println("instanceof Long");
      ly = (Long) y;
    } else if (y instanceof Short) {
      System.out.println("instanceof Short");
      ly = (Short) y;
    } else if (y instanceof Byte) {
      System.out.println("instanceof Byte");
      ly = (Byte) y;
    } else if (y instanceof Integer) {
      System.out.println("instanceof Integer");
      ly = (Integer) y;
    }

    return BigInteger.valueOf(lx + ly);
  }


}
