
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PractiseStream {

  public static void main(String[] args) {
    
    Stream<String> stringStream = Stream.empty();
    List<String> stringList = stringStream.toList();
    System.out.println(stringList);


    // Stream<T> of( T t1, T t2 ... )
    Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
    intStream.forEach(System.out::println);

    // Stream<T> generate( Supplier <? extends T> supplier)
    Stream<Integer> randomStream = Stream.generate(() -> new Random().nextInt(10)).limit(10);
    List<Integer> randomList = randomStream.toList();
    System.out.println(randomList);

    // Stream<T> iterate(int seed, UnaryOperator )
    Stream<Integer> iterateStream = Stream.iterate(1, e -> e + 1).limit(5); // from seed, iterate until 5 elements are generated
    List<Integer> iterateList = iterateStream.toList();
    System.out.println(iterateList);    // [1, 2, 3, 4, 5]

    List<Integer> filtered = iterateList.stream().filter(e -> e%2 == 0).toList();
    System.out.println(filtered);

    





  }
  
}
