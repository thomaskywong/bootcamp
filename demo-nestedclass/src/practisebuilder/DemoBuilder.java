import java.time.LocalDate;

public class DemoBuilder {

  public static void main(String[] args) {

    Employee thomas = Employee.builder().name("Thomas")
        .salary(20000).dateOfEntry(LocalDate.of(2023, 11, 18)).build();

    System.out.println(thomas);
    System.out.println();

    Employee mary = Employee.builder().name("Mary").salary(15000)
        .dateOfEntry(LocalDate.of(2021, 10, 8)).build();

    System.out.println(mary);
    System.out.println();

    System.out.println(thomas.equals(thomas));
    System.out.println(mary.equals(thomas));


  }

}