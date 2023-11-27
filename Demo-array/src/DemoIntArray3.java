import java.util.Arrays;

public class DemoIntArray3 {

  public static void main(String[] args) {
    
    int[] arr = new int[] {100, -100, 34};
    
    // [100, -100, 34] -> [-100, 100, 34]`
    
    for (int i = 0; i < arr.length-2; i++) {
      int temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp; 
    }

    System.out.println(Arrays.toString(arr));


  }
  
}
