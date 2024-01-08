import java.time.LocalDate;

public class PractiseRecord2 {
  public static void main(String[] args) {

    Staff2 thomas = new Staff2("Thomas", LocalDate.of(2023, 12, 24));
    Staff2 thomas2 = new Staff2("Thomas", LocalDate.of(2023, 12, 24));

    Staff2 mary = new Staff2("Mary", LocalDate.of(2024, 1, 3));

    // toString()
    System.out.println(thomas);
    System.out.println(mary);

    // .equal()
    System.out.println(thomas.equals(thomas2));
    System.out.println(thomas.equals(mary));

    // .hashCode()
    System.out.println(thomas.hashCode());
    System.out.println(thomas2.hashCode());
    System.out.println(mary.hashCode());

    // instance method .print()
    thomas.print();



  }


}
