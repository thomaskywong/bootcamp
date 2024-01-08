package practiseoptional;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class PractiseOptional {

  public static void main(String[] args) {


    // Optional.of(xxx)
    Optional<List<String>> stringsOp = Optional.of(List.of("ABC", "DEF", "GHI"));
    for(String str : stringsOp.get() ) {
      System.out.println(str);
    }

    // T get()
    // return T Value
    List<String> list = stringsOp.get();
    System.out.println(list);


  }
}
