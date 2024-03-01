
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PractiseSorted {

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
        new ArrayList<>(List.of(s10, s9, s8, s7, s6, s1, s2, s3, s4, s5));

    // .sorted( Comparator Object)
    students.stream()
        .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()) > 0 ? -1 : 1)
        .forEach(e -> System.out.println(e));
    System.out.println();

    // .sorted( Comparator.comparing( getter method ) )
    students.stream().sorted(Comparator.comparing(Student02::getId))
        .forEach(e -> System.out.println(e));
    System.out.println();

    // reverse order
    students.stream().sorted(Comparator.comparing(Student02::getId).reversed())
        .forEach(e -> System.out.println(e));
  }

}
