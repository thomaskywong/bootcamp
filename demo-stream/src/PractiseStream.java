import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseStream {

  public static void main(String[] args) {
    
    List<Integer> scores = new ArrayList<>(List.of(100, 88, 65, 79, 44, 50, 93));

    List<Integer> result = scores.stream().filter(x -> x >= 80).collect(Collectors.toList());
    
    Collections.sort(result, (x, y) -> x > y ? -1 : 1);
    System.out.println(result); // 100, 93, 88

  }
  
}
