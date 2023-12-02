import java.util.Arrays;

public class PractiseForEachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13};
    String s = "";
    for (int num : arr) {
      s = s + String.valueOf(num) + " "; 
      System.out.println(s);
    }
    
    String [] nums = s.split(" ");
    System.out.println(Arrays.toString(nums));

  }
}
