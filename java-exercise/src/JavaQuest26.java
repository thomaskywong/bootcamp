/*
* 
* Question : You are given an integer array nums. 
* The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    // code here ...

    int[] counter = new int[100];

    for (int num : nums) {
      counter[num-1]++;
    }

    // System.out.println(Arrays.toString(counter));

    int sum = 0;
    
    for (int i = 0; i < counter.length; i++) {
      if (counter[i] == 1) {
        sum += i + 1;
      }
    }
    return sum;
  }
}
