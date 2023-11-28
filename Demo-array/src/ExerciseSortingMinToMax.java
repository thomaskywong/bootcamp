import java.util.Arrays;

public class ExerciseSortingMinToMax {
  public static void main(String[] args){

    int[] arr2 = new int[] {100, 4, 1050, 500, -20};
    int temp = 0;
    
    // result {500, 100, 100, 4, -20}
    for (int i = 0; i < arr2.length -1; i++) {
      for (int j = i + 1; j < arr2.length; j++ ) {
        if (arr2[j] < arr2[i]) {
          temp = arr2[i];
          arr2[i] = arr2[j];
          arr2[j] = temp; 
        }
      }
    }

    System.out.println(Arrays.toString(arr2));

  }
}
