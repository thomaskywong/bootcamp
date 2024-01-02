package comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    
    return b2.getColor().getColorDescription().compareTo(b1.getColor().getColorDescription()) > 0 ? -1 : 1;

  }


  
}
