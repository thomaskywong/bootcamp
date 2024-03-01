
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class PractiseReducer {
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

    // count()
    // count the number of element in stream
    long count = students.stream().count();
    System.out.println("number of element in stream: " + count);

    // anyMatch(Predicate)
    // check if any element matches with Predicate
    System.out.println(students.stream().anyMatch(e -> e.getId() > 1010));
    System.out.println(students.stream().anyMatch(e -> e.getId() > 1005));

    // allMatch(Predicate object)
    // check if ALL element match with Predicate
    System.out.println(students.stream().allMatch(e -> e.getId() > 1000));
    System.out.println(students.stream().allMatch(e -> e.getId() > 1005));

    // nonMatch(Predicate object)
    // check if none of the element matches with Predicate
    System.out.println(students.stream().noneMatch(e -> e.getId() > 1010));

    // getFirst()
    // get the first element of the stream. Usually after sorting
    System.out.println("\ngetFirst()");
    students.stream()
        .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()) > 0 ? 1 : -1)
        .findFirst().ifPresentOrElse(e -> System.out.println(e),
            () -> System.out.println("Element not found!"));


    // getAny()
    // get any element of the stream. Usually after filterring
    System.out.println("\nfindAny()");
    students.stream().sorted(Comparator.comparing(Student02::getId))
        .filter(e -> e.getId() >= 1100).findAny()
        .ifPresentOrElse(e -> System.out.println(e),
            () -> System.out.println("Element not found!"));


    // max(Comparator Object)
    // get max value element based on the definition of Comparator object

    System.out.println("\nmax(Comparator object) by name");
    students.stream().max(Comparator.comparing(Student02::getName))
        .ifPresentOrElse(e -> System.out.println(e),
            () -> System.out.println("Element not found!"));
    
    System.out.println("\nmax(Comparator object) by id");
    students.stream()
            .max(Comparator.comparing(Student02::getId))
            .ifPresentOrElse(e -> System.out.println(e),
                            () -> System.out.println("Element not found!"));



    // min(Comparator Object)
    // get min value element based on the definition of Comparator object
    System.out.println("\nmin(Comparator object) by name");
    Student02 min =
        students.stream().min(Comparator.comparing(Student02::getName)).get();
    System.out.println(min);

    System.out.println("\nmin(Comparator object) by id");
    Student02 min2 =
        students.stream().min(Comparator.comparing(Student02::getId)).get();
    System.out.println(min2);

    // reduce(BinaryOperator object)
    System.out.println("\nreduce(BinaryOperator object)");
    String result = students.stream().map(e -> e.getName())
        .reduce((e1, e2) -> e1 + ", " + e2).get();
    System.out.println(result);

    System.out.println("\ncollect(Collectors.joining(\"\"))");
    String result2 = students.stream().map(e -> e.getName())
        .collect(Collectors.joining(", "));
    System.out.println(result2);

    // sum() - return sum value of a Number list
    System.out.println("mapToDouble(e -> e).sum()");
    List<Double> nums = new ArrayList<>(List.of(1.0d, 2.1d, 3.5d));
    double sum = nums.stream().mapToDouble(e -> e).sum();
    System.out.println("sum = " + sum);
  }
}
