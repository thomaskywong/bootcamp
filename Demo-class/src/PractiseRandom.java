import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

public class PractiseRandom {

  public static void main(String[] args) {
    // new Random()
    // create Random object
    Random random = new Random();

    // .nextInt(y)
    // generate int random number from 0 up to y-1
    int[] randoms = new int[10];
    for (int i = 0; i < randoms.length; i++) {
      randoms[i] = random.nextInt(11); // Generate random int from 0 to 10
    }
    System.out.println(String.valueOf(Arrays.toString(randoms)));

    // .nextInt(y)
    // generate int random number from negative integer to positive integer
    for (int i = 0; i < randoms.length; i++) {
      randoms[i] = random.nextInt(12) - 5; // Generate random int from -5 to 5
    }
    System.out.println(String.valueOf(Arrays.toString(randoms)));

    // .nextInt(x, y)
    // generate int random number from x up to y-1
    for (int i = 0; i < randoms.length; i++) {
      randoms[i] = random.nextInt(1, 11); // Generate random int from 1 to 10
    }
    System.out.println(String.valueOf(Arrays.toString(randoms)));

    // .nextDouble()
    // generate a random double value from 0 to 1
    for (int i = 0; i < 10; i++) {
      System.out.print(BigDecimal.valueOf(random.nextDouble()).setScale(2, RoundingMode.HALF_UP) + " ");
    }
    System.out.println();

    // Use ASCII value to generate random char value
    for (int i = 0; i < 10; i++) {
      System.out.print((char) (random.nextInt(26) + 'A') + " ");
    }
  }
}
