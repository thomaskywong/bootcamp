import java.time.LocalDate;

public class PractiseLocalDate {
  public static void main(String[] args) {

    // Static methods
    // LocalDate.now()
    // get real time date
    LocalDate d1 = LocalDate.now();
    System.out.println(d1); // 2023-12-08

    // LocalDate.parse("2023-12-15")
    LocalDate d2 = LocalDate.parse("2023-12-09");
    System.out.println(d2);

    // LocalDate.of(year, month, day)
    LocalDate d3 = LocalDate.of(2023, 12, 07);
    System.out.println(d3);

    // instance methods
    // .getYear()
    System.out.println(d3.getYear()); // 2023

    // .getMonthValue() return numercial value
    System.out.println(d2.getMonthValue()); // (Value -> 12)

    // .getMonth()
    System.out.println(d1.getMonth()); // DECEMBER

    // .getDayOfMonth()
    System.out.println(d1.getDayOfMonth()); // 8

    // .getDayOfWeek()
    System.out.println(d2.getDayOfWeek()); // SATURDAY


    // .getDayOfWeek().getValue()
    System.out.println(d2.getDayOfWeek().getValue()); // 6

    // .plusDays(x)
    System.out.println(d1.plusDays(2).getDayOfMonth()); // 8 + 2 = 10

    // .plusMonths(x)
    System.out.println(d1.plusMonths(1).getMonth()); // December + 1 = JANUARY

    // .plusYears(x)
    System.out.println(d1.plusYears(2).getYear()); // 2025

    // .isBefore(LocalDate)
    System.out.println(d1.isBefore(d2)); // true

    // .isAfter(LocalDate)
    System.out.println(d1.isAfter(d2)); // false

    // .isEqual(LocalDate)
    System.out.println(d1.isEqual(d1));  // true

  }
}
