import java.util.Arrays;
import java.util.Random;

public class PractiseArrayCountingChar {

  public static void main(String[] args) {

    int arraySize = 100;
    char[] chars = new char[arraySize];
    int min = Character.MAX_VALUE;
    int max = Character.MIN_VALUE;
    int counterArraySize = 0;

    for (int i = 0; i < arraySize; i++) {
      chars[i] = Character.valueOf((char) (new Random().nextInt(26) + 65)); // 'A' to 'Z'

      if (chars[i] < min)
        min = chars[i];
      if (chars[i] > max)
        max = chars[i];
    }

    System.out.println(Arrays.toString(chars));

    counterArraySize = max - min + 1;

    int[] charCounter = new int[counterArraySize];

    for (int i = 0; i < arraySize; i++) {
      charCounter[chars[i] - min]++;
    }

    int maxCount = 0;
    int maxIndex = 0;

    for (int i = 0; i < counterArraySize; i++) {
      System.out.println(String.valueOf((char) (i + min)) + " occurs " + charCounter[i] + " times.");

      if (charCounter[i] > maxCount) {
        maxCount = charCounter[i];
        maxIndex = i;
      }

    } 

    System.out.println((char) (maxIndex + min) + " has the maximum occurance at " + charCounter[maxIndex] + " times.");





  }
}
