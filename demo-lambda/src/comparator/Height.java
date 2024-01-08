package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Height {

  public static void main(String[] args) {
    
    Integer[] heights = new Integer[] {3,6,1,5,2};

    System.out.println(Arrays.toString(heights));

    Comparator<Integer> decendSort = (o1, o2) -> o2.compareTo(o1) > 0 ? 1 : -1;
    Arrays.sort(heights, decendSort);

    System.out.println(Arrays.toString(heights));
  }
  
}
