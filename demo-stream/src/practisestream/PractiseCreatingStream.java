package practisestream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PractiseCreatingStream {

  public static void main(String[] args) {
    
    // Create a List, then convert to a Stream
    
    Student02 s1 = new Student02("Thomas");
    Student02 s2 = new Student02("Peter");
    Student02 s3 = new Student02("Emily");
    Student02 s4 = new Student02("Joe");
    Student02 s5 = new Student02("Mandy");
    
    List<Student02> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));

    Stream<Student02> studentStream = students.stream();
    studentStream.forEach(e -> System.out.println(e));
    System.out.println();
    
    // Create an Array, the nconvert to a Stream
    Student02[] students2 = new Student02[] {s5, s4, s3, s2, s1};

    Arrays.stream(students2).forEach(e -> System.out.println(e));
    System.out.println();

    // Stream.of(e1, e2, e3, ...)
    Stream<Student02> students3 = Stream.of(s1, s2, s3, s4, s5);
    students3.forEach(e -> System.out.println(e));
    System.out.println();

    // Stream.generate(Supplier object)
    Stream<Student02> students4 = Stream.generate(() -> new Student02(String.valueOf((char) (new Random().nextInt(26) + 'a' -1 ))))
                                      .limit(10);
    students4.forEach(e -> System.out.println(e));
    System.out.println();

    // Stream.iterate(seed, Supplier object)
    Stream<Integer> sequence = Stream.iterate(1, e -> e*2)
                                     .limit(10);
    sequence.forEach(e -> System.out.println(e)); 

    

  }
  
}
