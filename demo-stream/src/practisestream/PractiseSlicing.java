package practisestream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PractiseSlicing {

  public static void main(String[] args) {


    Student02 s1 = new Student02("Thomas");
    Student02 s2 = new Student02("Peter");
    Student02 s3 = new Student02("Emily");
    Student02 s4 = new Student02("Joe");
    Student02 s5 = new Student02("Mandy");
    Student02 s6 = new Student02("Queenie");
    Student02 s7 = new Student02("Constantine");
    Student02 s8 = new Student02("Philips");
    Student02 s9 = new Student02("Jerry");
    Student02 s10 = new Student02("Tommy");

    List<Student02> students =
        new ArrayList<>(List.of(s3, s4, s6, s7, s8, s9, s10, s5, s1, s2));

    System.out.println(students);

    int itemsPerPage = 5;

    // skip(n) - skip the first n element
    // limit(n) - limit to n element in stream
    for (int page = 1; page <= 5; page++) {
      System.out.println();
      System.out.println("Page: " + page);
      students.stream().skip((page - 1) * itemsPerPage).limit(itemsPerPage)
          .forEach(e -> System.out.println(e));
    }

    // .takeWhile( Predicate object )
    System.out.println();
    students.stream().takeWhile(e -> e.getId() <= 1005)
        .forEach(e -> System.out.println(e));

    // .dripWhile( Predicate object )
    System.out.println();
    students.stream().dropWhile(e -> e.getId() <= 1005)
        .forEach(e -> System.out.println(e));

    Collections.sort(students, (x, y) -> x.getId() > y.getId() ? 1 : -1);
    System.out.println(students);
    
    // .takeWhile( Predicate object )
    System.out.println();
    students.stream().takeWhile(e -> e.getId() <= 1005)
        .forEach(e -> System.out.println(e));

    // .dripWhile( Predicate object )
    System.out.println();
    students.stream().dropWhile(e -> e.getId() <= 1005)
        .forEach(e -> System.out.println(e));


  }
}
