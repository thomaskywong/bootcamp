import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {

  public static void main(String[] args) {
    // Game
    // Random number 1-100
    // Round 1: "Please input a number (1-100): "
    // Round 2: "Please input a number (xx- xxx)"
    // until bingo
    // if number out of range, keep asking

    int round = 1;
    int min = 1;
    int max = 100;
    int random = new Random().nextInt(100) + 1; // random number 1-100
    int guess = 0;

    // System.out.println("Random = " + random);

    do {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Round " + round + ": ");
      System.out.print("Please input a number (" + min + "-" + max + "): ");
      guess = scanner.nextInt();

      if (!(guess >= min && guess <= max)) {
        System.out.println("Invalid input!");
        continue;
      }

      if (guess == random) {
        System.out.println("Bingo! target = " + random);
      } else if (guess > random) {
        max = guess - 1;
        round++;
      } else {
        min = guess + 1;
        round++;
      }


    } while (guess != random);


  }

}
