import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) throws Exception {

        List<String> strings = new ArrayList<>(List.of("Thomas", "James",
                "Percy", "Gordon", "Emily", "Dissel"));

        strings.forEach(x -> System.out.println(x));

        List<String> result = new ArrayList<>();

        // Filter Out string with Length <= 5;
        strings.forEach(x -> {
            if (x.length() <= 5) {
                result.add(x);
            }
        });

        System.out.println(result);

        // stream() for using filter() methods
        // list object can invoke stream() method
        // use filter( Predicate<> obj ) and Predicate<> object to do filtering by Lambda
        // use Collectors.toList() to convert to List<>
        
        List<String> result2 = strings.stream() //
                .filter(s -> s.length() <= 5) // Predicate object "s -> s.length() <= 5"
                .collect(Collectors.toList()); // convert stream to List

        System.out.println(result2);

    }
}
