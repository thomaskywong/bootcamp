
import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
    int indexPosition = -1;
    Scanner input = new Scanner(System.in);
    
    do {
      System.out.print("Input an index for inserting the value: ");
      indexPosition = input.nextInt();
      if (indexPosition < 0 || indexPosition > my_array.length - 1) {
        System.out.println("Invalid Input. Please enter an integer between 0 and " + (my_array.length -1) + ".");
      }
    } while (indexPosition < 0 || indexPosition > my_array.length - 1);
    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    if (indexPosition < my_array.length - 1) {
      for (int i = 0; i < my_array.length - 1 - indexPosition; i++) {
        my_array[(my_array.length-1)-i] = my_array[(my_array.length-1)-i-1];
      }
      my_array[indexPosition] = newValue;
    }

    System.out.println("New Array: " + Arrays.toString(my_array));
  }
}