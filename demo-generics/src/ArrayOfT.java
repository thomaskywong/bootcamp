import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfT<T extends Number> {

  private List<T> values;

  public ArrayOfT() {
    this.values = new ArrayList<>();
  }

  public ArrayOfT(T value) {
    // this();
    this.values = new ArrayList<>();
    this.values.add(value);
  }

  public List<T> getValue() {
    return this.values;
  }

  public void add(T value) {
    this.values.add(value);
  }

  public double summation() {
    BigDecimal sum = BigDecimal.valueOf(0.0d);

    for (T element : this.values) {
      sum = sum.add(BigDecimal.valueOf((double) element));
    }

    return sum.doubleValue();

  }

  public double product() {
    BigDecimal product = BigDecimal.valueOf(1.0d);

    for (T element : this.values) {
      product = product.multiply(BigDecimal.valueOf((double) element));
    }

    return product.doubleValue();

  }

  // static method - use U for generic types
  public static <U extends Number> Double calculate(U u1, U u2) {
    // Byte, Short, Integer, Long, Float, Double

    double result = 0.0d;
    if (u1 instanceof Integer) {
      result += Double.valueOf((int) u1);
    } else if (u1 instanceof Byte) {
      result += Double.valueOf((byte) u1);
    } else if (u1 instanceof Short) {
      result += Double.valueOf((short) u1);
    } else if (u1 instanceof Long) {
      result += Double.valueOf((long) u1);
    } else if (u1 instanceof Double) {
      result += (Double) u1;
    } else if (u1 instanceof Float) {
      result += Double.valueOf((float) u1);
    }

    if (u2 instanceof Integer) {
      result +=  Double.valueOf((int) u2);
    } else if (u2 instanceof Byte) {
      result +=  Double.valueOf((byte) u2);
    } else if (u2 instanceof Short) {
      result +=  Double.valueOf((short) u2);
    } else if (u2 instanceof Long) {
      result +=  Double.valueOf((long) u2);
    } else if (u2 instanceof Double) {
      result +=  (Double) u2;
    } else if (u2 instanceof Float) {
      result +=  Double.valueOf((float) u2);
    }

    return result;
    
  }

  // static method without U. Same signature as above static method 
  // public static Double calculate(Number u1, Number u2) {

  public static void main(String[] args) {

    ArrayOfT<Double> sum1 = new ArrayOfT<>(123.2);
    sum1.add(5.5);
    sum1.add(3.1);
    sum1.add(4.7);
    System.out.println(sum1.summation());
    System.out.println(sum1.product());

    // Generic type static method. No object involve. Cannot pre-define type at compilation time
    System.out.println(calculate(1, 2)); // 3.0
    System.out.println(calculate(1.0, 2)); // 3.0
    System.out.println(calculate(1.0f, 2L)); // 3.0
    System.out.println(calculate((short) 1, (byte) 2)); // 3.0



  }


}
