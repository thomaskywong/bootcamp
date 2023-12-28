package practiseinterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemoMethodInjection {

  public static <T extends CalculateArea> double totalArea(List<T> shapes) {
    BigDecimal result = BigDecimal.valueOf(0.0d);

    for (T s : shapes ) {
      result = result.add(BigDecimal.valueOf(s.area()));
    }

    return result.doubleValue();
  }

  public static void main(String[] args) {

    List<CalculateArea> list = new ArrayList<>();

    list.add(new Square(3.0));  // area = 9.0  
    list.add(new Rectangle(1.0, 2.0)); // area = 2.0
    list.add(new Rectangle(4.0, 8.0)); // area = 32.0
    list.add(new Square(5.0));  // area = 25.0

    System.out.println(totalArea(list));  // 68.0

  }
  
}
