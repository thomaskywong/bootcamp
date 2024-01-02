package lambda;

import java.util.ArrayList;
import java.util.List;

public class DemoForEach {
  public static void main(String[] args) {


    Student student1 = new Student("Thomas");
    Student student2 = new Student("James");
    Student student3 = new Student("Percy");

    List<Student> students =
        new ArrayList<>(List.of(student1, student2, student3));

    students.forEach(x -> System.out.println(x.getName()));

  }
}
