package interfaceinjection;

import java.util.List;

public class Checkout {
  
  // method injection
  // adjustment is variable parameter
  public static<T extends Adjustment> double calculate( List<T> items, double adjustment ) {
    double total = 0.0d;

    for (T item : items) {
      total += item.adjust(adjustment);
    }
    
    return total;
  }
}
