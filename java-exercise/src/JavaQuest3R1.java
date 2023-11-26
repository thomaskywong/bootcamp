
import java.util.Scanner;

public class JavaQuest3R1 {
  /**
   * Expected Output:
   * 
   * Input a month number: 2 Input a year: 2016 February 2016 has 29 days
   * 
   * Input a month number: 12 Input a year: 2014 December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.

  // The February has 29 days: (Every 4 years and the year cannot divded by 100)
  // or The year can divided by 400
  // otherwise the February should have 28 days only
  // how about other months, December?

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    boolean isHeapYear = false;
    final int[] DAYS_OF_MONTH =
        new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int DAYS_OF_FEB_HEAP_YEAR = 29;

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number (1 ~ 12): ");
    int month = input.nextInt();
    if (!(month >= 1 && month <= 12))
      throw new IllegalArgumentException("Invalide input! Please enter integer between 1 and 12.");

    System.out.print("Input a year ( > 0): ");
    int year = input.nextInt();
    if (year <= 0)
      throw new IllegalArgumentException("Invalid input! Please enter integer greater than 0.");

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      isHeapYear = true;

    // Complete the switch statement
    switch (month) {
      case 1:
        MonthOfName = "January";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      // Code here
      case 2:
        MonthOfName = "February";
        if (isHeapYear)
          number_Of_DaysInMonth = DAYS_OF_FEB_HEAP_YEAR;
        else
          number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 3:
        MonthOfName = "March";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 4:
        MonthOfName = "April";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 5:
        MonthOfName = "May";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 6:
        MonthOfName = "June";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 7:
        MonthOfName = "July";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 8:
        MonthOfName = "Augest";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 9:
        MonthOfName = "September";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 10:
        MonthOfName = "October";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 11:
        MonthOfName = "November";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      case 12:
        MonthOfName = "Demember";
        number_Of_DaysInMonth = DAYS_OF_MONTH[month - 1];
        break;
      default:

    }

    System.out.print(
        MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");

  }
}
