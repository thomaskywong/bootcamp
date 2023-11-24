
import java.util.Scanner;

public class PractiseSwitchInt {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;
    // switch statement using interger
    while (true) {
      do {
        System.out.println();
        System.out.println("Wellcome to XXX Bank Customer Service");
        System.out.println("For general enquiry, please press \"1\"");
        System.out.println("For bank account service, please press \"2\"");
        System.out.println("For credit card service, please press \"3\"");
        System.out.println("For personal loan or mortgage, please press \"4\"");
        System.out.println("For other enquiry, please press \"5\"");
        System.out.println("To repeat all options, please press \"6\"");
        System.out.println("To hang up, please press \"0\"");
        System.out.print("Enter : ");
        selection = scanner.nextInt();
        if (!(selection >= 0 && selection <= 6))
          System.out.println("Invalid Input. Please try again!");
      } while (!(selection >= 0 && selection <= 6));

      switch (selection) {
        case 0:
          System.out.println("Hang up. Good bye!");
          break;
        case 1:
          System.out.println("Proceed general enquiry");
          break;
        case 2:
          System.out.println("Proceed bank account service");
          break;
        case 3:
          System.out.println("Proceed credit card service");
          break;
        case 4:
          System.out.println("Proceed personal loan or mortgage");
          break;
        case 5:
          System.out.println("Proceed other enquiry");
          break;
        case 6:
          System.out.println("Repeat all options");
          break;
        default:
      }

      if (selection == 0)
        break;

    }
  }
}
