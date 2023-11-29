/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax = 0;
    // code here
    secondMax = getSecondMax(nums);
    System.out.println("The Second Max of nums = " + secondMax);
    secondMax = getSecondMax(nums2);
    System.out.println("The Second Max of nums2 = " + secondMax);
    secondMax = getSecondMax(nums3);
    System.out.println("The Second Max of nums3 = " + secondMax);
    secondMax = getSecondMax(nums4);
    System.out.println("The Second Max of nums4 = " + secondMax);
  }

  public static int getSecondMax(int[] arr) {
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        firstMax = arr[i];
      } else {
        if (arr[i] > firstMax) {
          secondMax = firstMax;
          firstMax = arr[i]; 
        } else if (arr[i] > secondMax) {
          secondMax = arr[i];
        }
      }
    }
    return secondMax;
  }

}