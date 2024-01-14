package practisestream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseMapping {

  public static void main(String[] args) {

    Student02 s1 = new Student02("Thomas");
    Student02 s2 = new Student02("Peter");
    Student02 s3 = new Student02("Emily");
    Student02 s4 = new Student02("Joe");
    Student02 s5 = new Student02("Mandy");

    List<Student02> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));

    // .map(Function object)
    students.stream().map(e -> e.getName())
        .forEach(name -> System.out.println(name));
    System.out.println();

    students.stream().map(e -> e.getId()).forEach(id -> System.out.println(id));
    System.out.println();

    List<Integer> ids =
        students.stream().map(e -> e.getId()).collect(Collectors.toList());
    System.out.println(ids);
    System.out.println();

    // .flatmap( e -> e.toStream() )
    List<String> names1 = students.stream().map(name -> name.getName())
        .collect(Collectors.toList());

    List<String> names2 = students.stream().map(name -> name.getName())
        .collect(Collectors.toList());

    List<String> names3 = students.stream().map(name -> name.getName())
        .collect(Collectors.toList());

    List<List<String>> listOfNames = new ArrayList<>(List.of(names1, names2, names3));
    System.out.println(listOfNames); 
    System.out.println();

    List<String> listOfNames2 = listOfNames.stream()
                                           .flatMap(e -> e.stream())
                                           .collect(Collectors.toList());
    System.out.println(listOfNames2);


  }

}
