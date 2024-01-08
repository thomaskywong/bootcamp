import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of( "defg", "abcde", "ijk"));

        // Instance method
        // String.length()
        // For instance method, method reference takes the object as input, then .method()
        List<Integer> strLengths = strings.stream() //
                .map(e -> e.length()) //
                .collect(Collectors.toList());
        System.out.println(strLengths);

        List<Integer> strLengths2 = strings.stream() //
                .map(String::length) //
                .collect(Collectors.toList());
        System.out.println(strLengths2);

        List<Integer> sorted3 = strings.stream()
                .map(String::length)
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(sorted3);


        // String sorting
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1) > 0 ? -1 : 1)
                .collect(Collectors.toList());
        System.out.println(sorted);

        List<String> sorted2 = strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(sorted2);

        // List<Integer> sorted2 = strLengths2.stream()

        // Static method
        // For static method, use ClassName.method(e) to call method, then use a single element from stream as single input parameter
        //strings.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // method reference
        // When there is a single input, and only one parameter of the method
        // input is an element of the stream
        // could use ClassName::MethodName
        //strings.stream().forEach(System.out::println);



    }
}
