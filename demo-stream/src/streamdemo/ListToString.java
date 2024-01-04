package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {

  public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>(List.of("ABC","EDF","GHI","JKL","MNO"));
 
    String output = strings.stream().collect(Collectors.joining());

    System.out.println(output);





  }
  
}
