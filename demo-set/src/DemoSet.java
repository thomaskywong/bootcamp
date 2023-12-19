import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) throws Exception {

        // Set is an interface, HashSet is a class

        Set<String> ss = new HashSet<>(); // Is a hash map
        List<String> ls = new ArrayList<>();


        ls.add("ABC");
        ls.add("ABC");
        ls.add("ABC");

        // HashSet methods
        // .add(Object)
        for (String s : ls) {
            System.out.println(ss.add(s)); // true, false, false
        }

        // .size()
        System.out.println(ss.size()); // only one "ABC" is added in HashSet

        // .contains(Object)
        if (ss.contains("ABC")) {
            System.out.println("ss contains ABC");
        }

        // .remove(Object)
        ss.remove("ABC");
        System.out.println(ss);

        // isEmpty()
        if (ss.isEmpty()) {
            System.out.println("ss is empty.");
        }

        List<String> list1 =
                new ArrayList<>(List.of("ABC", "EFG", "HIJ", "ABC"));
        ss.addAll(list1);
        System.out.println(ss); // ["ABC","EFG","HIJ"]



    }
}
