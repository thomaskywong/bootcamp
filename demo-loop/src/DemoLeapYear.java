public class DemoLeapYear {
  public static void main(String[] args) {

    for (int year = 2009; year < 2401; year++) {
      if (!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
        continue;
      } else
        System.out.println(year + " is a leap year.");
    }

  }
}
