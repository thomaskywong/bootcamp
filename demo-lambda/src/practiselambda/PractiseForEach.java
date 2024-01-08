package practiselambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PractiseForEach {

  public static void main(String[] args) {
    List<String> list =
        new ArrayList<>(List.of("Thomas", "Percy", "James", "Gordon", "Emily"));
    String item = " the Train";

    // Collector.forEach( Consumer Object with Lambda expression)
    list.forEach(System.out::println);

    List<String> trains =
        list.stream()
            .map(x -> x.concat(item))
            .collect(Collectors.toList());
    System.out.println(trains);

    List<String> trains2 = 
          list.stream()
              .filter(x -> x.startsWith("T"))
              .collect(Collectors.toList());
    System.out.println(trains2);

    List<String> trains3 =
        list.stream()
            .sorted((x, y) -> x.compareTo(y) > 0 ? 1 : -1)
            .collect(Collectors.toList());
    System.out.println(trains3);

    // reduce
    String trains4 =
        list.stream()
            .map(str -> str + " the Train, ")
            .reduce((s1, s2) -> s1.concat(s2))
            .get();
    
    System.out.println(trains4);

    List<String> list1 = new ArrayList<>(List.of("ABC", "DEF"));
    List<String> list2 = new ArrayList<>(List.of("GHI", "JKL"));
    List<List<String>> listOfList = new ArrayList<>(List.of(list1, list2));
    List<String> list3 = listOfList.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
    System.out.println(list3);
  

    String names = list.stream().collect(Collectors.joining(", "));
    System.out.println(names);
  }

}
