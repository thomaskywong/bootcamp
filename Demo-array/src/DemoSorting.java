import java.util.Arrays;

public class DemoSorting {

  public static void main(String[] args) {

    //1. bubble sorting
    int[] arr2 = new int[] {-20,100, 4, 1050, 500};
    int temp = 0;
    System.out.println(Arrays.toString(arr2));
    // result {1050, 500, 100, 4, -20}
    for (int i = 0; i < arr2.length - 1; i++) {
      for (int j = 0; j < arr2.length - 1- i; j++ ) {
        if (arr2[j] > arr2[j+1]) {
          temp = arr2[j];
          arr2[j] = arr2[j+1];
          arr2[j+1] = temp; 
        }
      }
    }
    System.out.println();
    System.out.println("Final result: " + Arrays.toString(arr2));
  }

}