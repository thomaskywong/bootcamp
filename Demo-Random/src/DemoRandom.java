import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // int target = new Random().nextInt(3); // generate random number from 1-2
        // System.out.println("Random number = " + target);

        int min = 1;
        int max = 100;
        // generate random number from 1 to 3
        int target2 = new Random().nextInt(max) + 1;
        //System.out.println("Random: " + target2);
        


        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        do {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            guess = scanner.nextInt();

            if (!(guess >= min && guess <= max))
                System.out.println("Invalid Input.\n");
            else if (guess != target2)
                System.out.println("Try again.\n");
            else
                System.out.println("Bingo!\n");

        } while (guess != target2);
    }
}
