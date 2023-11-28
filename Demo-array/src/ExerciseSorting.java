import java.util.Arrays;

public class ExerciseSorting {

  public static void main(String[] args){

    int[] arr2 = new int[] {100,-20, 4, 100, 500};
    
    // Assume the array is not Empty
    // result {100, 4, 100, 500, -20}
    int targetIndex = 1;
    for (int i = 0; i < arr2.length - 1; i++) {
      if (i < targetIndex)
        continue;
      int temp = arr2[i];
      arr2[i] = arr2[i+1];
      arr2[i+1] = temp;
    }

    System.out.println(Arrays.toString(arr2));
    System.out.println();

    // maximum number to the end
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    System.out.println(Arrays.toString(arr3));
    for (int i = 0; i < arr3.length - 1; i++) {
      if (arr3[i] > arr3[i+1]) { 
        int temp = arr3[i];
        arr3[i] = arr3[i+1];
        arr3[i+1] = temp;
      }
    }
    
    System.out.println(Arrays.toString(arr3));

  }
  
}
