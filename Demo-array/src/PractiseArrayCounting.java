import java.util.Arrays;
import java.util.Random;

public class PractiseArrayCounting {

  public static void main(String[] args) {

    int arraySize = 20;
    int[] numbers = new int[arraySize];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int counterArraySize = 0;

    for (int i = 0; i < arraySize; i++) {
      numbers[i] = new Random().nextInt(10) - 5;    // -5 to 4

      if (numbers[i] > max)
        max = numbers[i];
      if (numbers[i] < min)
        min = numbers[i];

    }

    System.out.println("numbers = " + Arrays.toString(numbers));

    counterArraySize = max - min + 1;

    int[] counter = new int[counterArraySize];      // default int values = 0

    for (int i = 0; i < arraySize; i++) {
      counter[numbers[i] - min]++;
    }
    
    int maxCount = 0;
    int maxIndex = 0;
    for (int i = 0; i < counterArraySize; i++) {
      System.out.println("Number = " + (i + min) + ", count = " + counter[i]);
      if (counter[i] > maxCount) {
        maxCount = counter[i];
        maxIndex = i;
      }
    }
    System.out.println("The first maximum occurance number = " + (maxIndex + min) + ", count = " + counter[maxIndex]);

  }
  
}
