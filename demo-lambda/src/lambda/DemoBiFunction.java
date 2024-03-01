import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class DemoBiFunction {
  public static void main(String[] args) {

    // BiFunction
    // R apply(T t, U u)
    // BiFunction<T, U, R>
    BiFunction<List<String>, Integer, String> getByIndex = (list, index) -> {
      return list.get(index);
    };

    List<String> strings = List.of("AAA", "BBB", "CCC");
    System.out.println(getByIndex.apply(strings, 2)); // "CCC"
    System.out.println();

    // Example for applying Function
    // Map interface method compute
    Map<String, String> dicMap = new HashMap<>();
    // .put(key, Value);
    dicMap.put("John", "World!");
    dicMap.put("Mary", "students");
    dicMap.put("Thomas", null);
    dicMap.put("Peter", "teachers");

    BiFunction<String, String, String> remapFunc = (key, oldValue) -> {
      if (oldValue == null)
        return "Hello";
      if ("Peter".equals(key))
        return null;
      return "Hello ".concat(oldValue);
    };

    // Map default method .compute(K, BiFunction object)
    // default V compute(K key, BiFunction<? super K, ? super V, ? extendsV> remappingFunction) {}
    // ? super K = key arguement type
    // ? super V = value arguement type
    // ? extends V = return type

    // BiFunction<K, V, R>
    // R apply(K key, V oldValue)
    System.out.println(dicMap.compute("Mary", remapFunc));
    System.out.println(dicMap.compute("Thomas", remapFunc));
    System.out.println(dicMap.compute("Thomas", remapFunc));

    System.out.println(dicMap.compute("Peter", remapFunc));
    System.out.println(dicMap.compute("Peter", remapFunc));



  }
}
