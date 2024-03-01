
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PractisePartitioning {

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

    // Approach 1:
    Map<Integer, String> studentMap1 = students.stream()
        .collect(Collectors.toMap(Student::getId, Student::getName));
    System.out.println(studentMap1);
    System.out.println();

    Map<Boolean, String> studentMap2 =
        students.stream().collect(Collectors.groupingBy(e -> e.getId() <= 1005,
            Collectors.mapping(e -> e.getName(), Collectors.joining(", "))));
    System.out.println(studentMap2);
    System.out.println();

    // Collectors.mapping(Student::getId, Collectors.toList()) similar to
    // .map(e -> e.getId()).collect(Collectors.toList())
    Map<Boolean, List<Integer>> studentMap3 = students.stream()
        .collect(Collectors.groupingBy(e -> e.getRank() == Rank.EXCELLENT,
            Collectors.mapping(Student::getId, Collectors.toList())));
    System.out.println(studentMap3);

    // collect( Collectors.partitioningBy(Predicate object, Collectors object))
    Map<Boolean, String> studentMap4 = students.stream()
        .collect(Collectors.partitioningBy(e -> e.getRank() == Rank.EXCELLENT,
            Collectors.mapping(Student::getName, Collectors.joining(", "))));
    System.out.println(studentMap4);

    // to List<Student> as downstream Collector
    Map<Boolean, List<Student>> studentMap6 = students.stream()
        .collect(Collectors.partitioningBy(e -> e.getRank() == Rank.EXCELLENT,
            Collectors.mapping(e -> e, Collectors.toList())));
    System.out.println(studentMap6);

  }

}
