import java.util.Arrays;

public class ExerciseSorting {

  public static void main(String[] args){

    int[] arr2 = new int[] {100,-20, 4, 100, 500};
    
    // Assume the array is not Empty
    // result {100, 4, 100, 500, -20}
    for (int i = 0; i < arr2.length - 1; i++) {
      if (i == 0) 
        continue;
      int temp = arr2[i];
      arr2[i] = arr2[i+1];
      arr2[i+1] = temp;
    }

    System.out.println(Arrays.toString(arr2));

  }
  
}
