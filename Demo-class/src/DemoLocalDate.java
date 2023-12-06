import java.time.LocalDate;

public class DemoLocalDate {

  public static void main(String[] args) {
    
    // Constructor using .of()
    LocalDate date2 = LocalDate.of(2023, 12, 5);
    System.out.println(date2);

    LocalDate date3 = LocalDate.of(2023, 12, 4);
    LocalDate date04 = LocalDate.of(2023, 12, 4);

    // .equals()
    System.out.println(".equals()");
    System.out.println(date2.equals(date3));      // false
    System.out.println(date04.equals(date3));     // true
    System.out.println();


    // .isAfter
    System.out.println(".isAfter()");
    System.out.println(date3.isAfter(date2));     // false
    System.out.println(date2.isAfter(date3));     // true
    
    // .isBefore
    System.out.println(date3.isBefore(date2)); 
    
    // .isHeapYear
    LocalDate date4 = LocalDate.of(2400, 12, 31);
    System.out.println(date4.isLeapYear());     // 2400 is leap year, true

    // .getMonthValue()
    System.out.println(date4.getMonthValue());   // 12

    // .getMonth()
    System.out.println(date4.getMonth().toString());    // DECEMBER

    System.out.println(date4.getDayOfMonth());    // 31

  }
  
}
