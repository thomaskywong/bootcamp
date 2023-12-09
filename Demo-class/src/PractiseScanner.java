import java.util.Scanner;

public class PractiseScanner {
  public static void main(String[] args) {

    // create Scanner object
    // new Scanner(System.in)
    Scanner scanner = new Scanner(System.in);

    // get integer
    // .nextInt()
    System.out.print("Please enter an integer: ");
    int a = scanner.nextInt();
    System.out.println("Input: " + a);

    // .nextByte()
    System.out.print("Please enter a byte number: ");
    byte b = scanner.nextByte();
    System.out.println("Input: " + b);

    // .nextShort()
    System.out.print("Please enter a short number: ");
    short c = scanner.nextShort();
    System.out.println("Input: " + c);

    // get double
    // .nextDouble()
    System.out.print("Please enter a double number: ");
    double d = scanner.nextDouble();
    System.out.println("Input: " + d);

    // get a String after getting a number
    // .nextLine()
    // use .nextLine() to clean up buffer first after previous entering
    scanner.nextLine();     // clean up buffer
    System.out.print("Please enter a name: ");
    String s = scanner.nextLine();
    System.out.println("Hello " + s);

    // get multiple tokens separated by " "
    // .next()
    System.out.print("Please enter a name: ");
    String firstName = scanner.next();
    String lastName = scanner.next();
    System.out.println("Hello " + firstName + " " + lastName);

    // get two integers
    System.out.println("Enter two integers");
    System.out.print("Enter the first integer: ");
    int k1 = scanner.nextInt();

    scanner.nextLine();    // clean up buffer

    System.out.print("Enter the second integer: ");
    int k2 = scanner.nextInt();
    scanner.nextLine();    // clean up buffer


    System.out.println("k1 = " + k1 + ", k2 = " + k2);

    // Must close Scanner object before leave
    // .close()
    scanner.close();




  }
}
