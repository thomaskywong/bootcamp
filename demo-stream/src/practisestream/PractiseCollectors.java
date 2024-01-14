package practisestream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PractiseCollectors {

  public static void main(String[] args) {

    Student02 s1 = new Student02("Thomas");
    Student02 s2 = new Student02("Peter");
    Student02 s3 = new Student02("Emily");
    Student02 s4 = new Student02("Joe");
    Student02 s5 = new Student02("Mandy");
    Student02 s6 = new Student02("Queenie");
    Student02 s7 = new Student02("Zoe");
    Student02 s8 = new Student02("Philips");
    Student02 s9 = new Student02("Jerry");
    Student02 s10 = new Student02("Tommy");

    List<Student02> students =
        new ArrayList<>(List.of(s10, s9, s8, s7, s6, s1, s2, s3, s4, s5));
    Collections.sort(students, Comparator.comparing(Student02::getId));
    System.out.println(students);

    // .collect( Collectors.toMap( Function Object for key , Function Object for value))
    Map<Integer, String> studentsMap = students.stream()
        .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
    for (Map.Entry<Integer, String> item : studentsMap.entrySet()) {
        System.out.println(item);
    }
    System.out.println(studentsMap);

    // .collect( Collectors.toList())
    List<Student02> studentList= students.stream().filter(e -> e.getId() > 1005).collect(Collectors.toList());
    System.out.println(studentList);
    
    // .collect(Collectors.toSet())
    Set<String> studentNameSet = students.stream()
                                         .map(e -> e.getName())
                                         .collect(Collectors.toSet());
    System.out.println(studentNameSet);
    System.out.println();

    // .collect( Collectors.summarizingInt( Student::getId))
    System.out.println(students.stream().collect(Collectors.summarizingInt(Student02::getId)));

  }

}
