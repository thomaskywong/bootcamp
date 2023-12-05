// package day10;
/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

import java.util.Arrays;
import java.util.Random;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  public static int[] sumToZero(int n) {
    int[] result = new int[n];
    int max = 10;
    int min = -1 * max;
    int lengthOfCounterArr = n * max + 1;
    int[] posNumCounter = new int[lengthOfCounterArr];
    int[] negNumCounter = new int[lengthOfCounterArr];
    int randomNumCount = n - 2;
    int randomNum;

    if (n == 1) {
      // System.out.println(Arrays.toString(result));
      return result;
    }

    if (n == 2) {
      do {
        randomNum = (int) (Math.random() * (2 * max + 1) + min);
      } while (randomNum == 0);

      result[0] = randomNum;
      result[1] = -1 * result[0];
      // System.out.println(Arrays.toString(result));
      return result;
    }

    int index = 0;
    int sum = 0;

    while (randomNumCount > 0) {

      do {
        randomNum = (int) (Math.random() * (2 * max + 1) + min);
      } while (randomNum == 0);

      if (randomNum > 0 && posNumCounter[randomNum] > 0) {
        continue;
      }

      if (randomNum > 0) {
        posNumCounter[randomNum]++;
        result[index++] = randomNum;
        sum += randomNum;
        randomNumCount--;
      }

      if (randomNum < 0 && negNumCounter[-1 * randomNum] > 0) {
        continue;
      }

      if (randomNum < 0) {
        negNumCounter[-1 * randomNum]++;
        result[index++] = randomNum;
        sum += randomNum;
        randomNumCount--;
      }
    }

    int offset = -1 * sum;

    if (offset == 0) {
      for (int i = 1; i < lengthOfCounterArr; i++) {
        if (posNumCounter[i] == 0 && negNumCounter[i] == 0) {
          result[n - 2] = i;
          result[n - 1] = -1 * i;
          break;
        }
      }
      // System.out.println(Arrays.toString(result));
      return result;
    }

    for (int i = 1; i < lengthOfCounterArr; i++) {
      for (int j = 0; j < lengthOfCounterArr; j++) {

        if (i + j == offset && i != j && posNumCounter[i] == 0
            && posNumCounter[j] == 0) {
          result[n - 2] = i;
          result[n - 1] = j;
          // System.out.println(Arrays.toString(result));
          return result;
        }
        if (i - j == offset && posNumCounter[i] == 0 && negNumCounter[j] == 0) {
          result[n - 2] = i;
          result[n - 1] = -1 * j;
          // System.out.println(Arrays.toString(result));
          return result;
        }
        if (-1 * (i + j) == offset && i != j && negNumCounter[i] == 0
            && negNumCounter[j] == 0) {
          result[n - 2] = -1 * i;
          result[n - 1] = -1 * j;
          // System.out.println(Arrays.toString(result));
          return result;
        }

      }

    }

    return result;
  }


}
