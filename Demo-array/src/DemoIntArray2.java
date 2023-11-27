import java.util.Arrays;

public class DemoIntArray2 {

  public static void main(String[] args) {
    int[] arr = new int[] {10, 8, 16, 25, 10};

    System.out.println(Arrays.toString(arr));

    int sum = 0;
    // for loop to sum
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.println("sum = " + sum);

    // maximum:
    // Also applicable to empty array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    System.out.println("max = " + max);

    // minimum:
    // Also applicable to empty array
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min)
        min = arr[i];
    }
    System.out.println("max = " + min);

    // Second Maximum of the array
    // {10, 16, 8}
    
    System.out.println(Arrays.toString(arr));
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > firstMax) {
        secondMax = firstMax;
        firstMax = arr[i];
      } else if (arr[i] > secondMax) {
        secondMax = arr[i];
      }
      System.out.println("firstMax = " + firstMax + " secondMax = " + secondMax);
    }


    System.out.println("firstMax = " + firstMax);
    System.out.println("secondMax = " + secondMax);

  }
}

