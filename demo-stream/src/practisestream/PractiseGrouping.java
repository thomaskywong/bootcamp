package practisestream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PractiseGrouping {

  public static void main(String[] args) {
    Student s1 = new Student("Thomas", Rank.EXCELLENT);
    Student s2 = new Student("Peter", Rank.GOOD);
    Student s3 = new Student("Emily", Rank.EXCELLENT);
    Student s4 = new Student("Joe", Rank.FAIR);
    Student s5 = new Student("Mandy", Rank.GOOD);
    Student s6 = new Student("Queenie", Rank.EXCELLENT);
    Student s7 = new Student("Zoe", Rank.GOOD);
    Student s8 = new Student("Philips", Rank.FAIR);
    Student s9 = new Student("Jerry", Rank.FAIR);
    Student s10 = new Student("Tommy", Rank.EXCELLENT);

    List<Student> students =
        new ArrayList<>(List.of(s10, s9, s8, s7, s6, s1, s2, s3, s4, s5));

    // Collectors.groupingBy(Function object on identifier)
    Map<Rank, List<Student>> studentGroup =
        students.stream().collect(Collectors.groupingBy(Student::getRank));
    System.out.println(studentGroup);
    System.out.println();

    Map<Rank, Set<Student>> studentSet = students.stream()
        .collect(Collectors.groupingBy(Student::getRank, Collectors.toSet()));
    System.out.println(studentSet);
    System.out.println();

    // Collectors.counting()
    Map<Rank, Long> studentCount = students.stream()
                                   .collect(Collectors.groupingBy(Student::getRank, 
                                            Collectors.counting()));
    System.out.println(studentCount);

    // Collectors.joining(", ")
    // joining strings together with ", ". Needs Function object to convert to String first
    Map<Rank, String> studentName = students.stream()
                                            .collect(Collectors.groupingBy(Student::getRank, 
                                             Collectors.mapping(Student::getName, Collectors.joining(", "))));
    System.out.println(studentName);

  }

}
