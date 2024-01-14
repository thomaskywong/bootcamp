package practisestream;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PractisePrimitiveStream {

  public static void main(String[] args) {
    
    // IntStream
    IntStream integers = IntStream.generate(() -> new Random().nextInt(10)).limit(10);
    integers.forEach(System.out::println);

    // LongStream
    LongStream longs = LongStream.rangeClosed(1, 10000);
    long longNumbers = longs.sum();
    System.out.println("sum = " + longNumbers);
    System.out.println();

    // DoubleStream
    DoubleStream doubles = DoubleStream.iterate(0.0d, e -> BigDecimal.valueOf(e).add(BigDecimal.valueOf(0.1)).doubleValue()).limit(50);
    System.out.println("Average = " + doubles.average().getAsDouble());
    //doubles.forEach(System.out::println);



  }
  
}
