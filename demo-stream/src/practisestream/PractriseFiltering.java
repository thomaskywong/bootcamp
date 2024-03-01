
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PractriseFiltering {

  public static void main(String[] args) {

    Student02 s1 = new Student02("Thomas");
    Student02 s2 = new Student02("Peter");
    Student02 s3 = new Student02("Emily");
    Student02 s4 = new Student02("Joe");
    Student02 s5 = new Student02("Mandy");
    Student02 s6 = new Student02("Queenie");
    Student02 s7 = new Student02("Constantine");
    Student02 s8 = new Student02("Philips");


    List<Student02> students = new ArrayList<>(List.of(s6, s7, s8, s1, s2, s3, s4, s5));
    Collections.sort(students, (x, y) -> x.getId() < y.getId() ? -1 : 1 );
    System.out.println(students);

    students.stream().forEach(e -> System.out.println(e));
    System.out.println();
    students.stream().filter(e -> e.getId() > 1005).forEach(e -> System.out.println(e.getName()));
    System.out.println();
    
    students.stream().filter(e -> e.getName().toUpperCase().charAt(0) > 'M').forEach( e -> System.out.println(e));

  }

}
