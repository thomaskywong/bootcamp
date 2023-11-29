import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int size = 15;
    int[] seq = new int[size];
    seq[0] = 1;
    seq[1] = 1;

    for (int i = 0; i < size; i++) {
      if (i < 2) {
        System.out.print(seq[i] + " ");
      } else {
        seq[i] = seq[i - 1] + seq[i - 2];
        System.out.print(seq[i] + " ");
      }
    }

    System.out.println();
    System.out.println(Arrays.toString(seq));
  }

}
