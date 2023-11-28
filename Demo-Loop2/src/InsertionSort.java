import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    // Approach 1:
    int[] arr2 = new int[] {100, -30, 40, 22, 44};

    System.out.println(Arrays.toString(arr2));

    for (int i = 0; i < arr2.length - 1; i++) {
      for (int j = 0; j < i + 1; j++) {
        if (arr2[i - j + 1] < arr2[i - j]) {
          int temp = arr2[i - j];
          arr2[i - j] = arr2[i - j + 1];
          arr2[i - j + 1] = temp;
        }
        // System.out.println("i = " + i + ", j = " + j);
        // System.out.println(Arrays.toString(arr2));
        // System.out.println();
      }
      System.out.println(Arrays.toString(arr2));
    }

    // Approach 2:
    System.out.println("Approach 2:");
    int[] arr3 = new int[] {103, 40, 100, 44, 22, -30, 120, 44, 66, -50};

    System.out.println(Arrays.toString(arr3));
    System.out.println();
    int j;

    for (int i = 0; i < arr3.length - 1; i++) {
      j = 0;
      while (j < i + 1) {
        if (arr3[i - j + 1] < arr3[i - j]) {
          int temp = arr3[i - j];
          arr3[i - j] = arr3[i - j + 1];
          arr3[i - j + 1] = temp;
          // System.out.println("i = " + i + ", j = " + j);
          // System.out.println(Arrays.toString(arr3));
          // System.out.println();
        } else {
          break;
        }
        j++;
      }
      System.out.println(Arrays.toString(arr3));
    }

  }

}


