import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.HashMap.Node;

public class PractiseHashMap {
  public static void main(String[] args) {

    HashMap<Integer, String> hashMap = new HashMap<>();

    // .put(K key, V value)
    // add (K, V) pair into HashMap
    hashMap.put(1, "AAA"); // 1=AAA
    hashMap.put(2, "BBB"); // 2=BBB
    System.out.println(hashMap);

    // rewrite value of given key pair
    hashMap.put(2, "ABC"); // rewrite key 2 pair -> 2=ABC
    System.out.println(hashMap);
    System.out.println();

    // .putIfAbsent(K key, V value)
    System.out.println(hashMap.putIfAbsent(3, "CCC")); // return null, 3=CCC
    System.out.println(hashMap);
    System.out.println(hashMap.putIfAbsent(3, "CDE")); // return CCC. cannot assign 3=CDE
    System.out.println(hashMap); // 1=AAA, 2=ABC, 3=CCC
    System.out.println();

    // .get(Object key)
    System.out.println(hashMap.get(1)); // AAA
    System.out.println(hashMap.get(4)); // null
    System.out.println();


    // .entrySet(), .getValue() and .getKey()
    System.out.println(hashMap);
    for (Map.Entry<Integer, String> item : hashMap.entrySet()) {
      System.out.println(item.getKey() + " = " + item.getValue()); // 1=AAA, 2=ABC, 3=CCC
    }
    System.out.println();

    hashMap.put(4, "DDD");
    hashMap.put(5, "EEE");
    // .remove(Object key)
    System.out.println(hashMap.remove(4)); // DDD
    System.out.println(hashMap.remove(6)); // null
    System.out.println(hashMap); // 1=AAA, 2=ABC, 3=CCC, 5=EEE
    System.out.println();

    // .remove(Object key, V value)
    System.out.println(hashMap.remove(3, "CCC")); // true
    System.out.println(hashMap.remove(4, "DDD")); // true
    System.out.println();

    // .containsKey(Object key)
    System.out.println(hashMap);
    System.out.println(hashMap.containsKey(1)); // true
    System.out.println(hashMap.containsKey(3)); // false
    System.out.println();

    // .containsValue(V value)
    System.out.println(hashMap.containsValue("EEE")); // true
    System.out.println(hashMap.containsValue("CCC")); // false

    // .size()
    System.out.println(hashMap);
    System.out.println(hashMap.size()); // 3
    System.out.println();

    // .isEmpty()
    System.out.println(hashMap.isEmpty()); // false
    System.out.println();

    // .clear()
    hashMap.clear();
    System.out.println(hashMap.isEmpty()); // true
    System.out.println(hashMap.size()); // 0
    System.out.println();

    hashMap.put(1, "ABC");
    hashMap.put(2, "DEF");
    hashMap.put(3, "GHI");
    hashMap.put(4, "JKL");
    hashMap.put(5, "MNO");

    // Set<V> values()   
    Collection<String> set = hashMap.values();
    System.out.println(set);
    
    List<String> list = new ArrayList<>(set);
    System.out.println(list);  // ABC DEF, GHI, JKL, MNO
    System.out.println();

    // Set<K> keySet()
    Set<Integer> set2 = hashMap.keySet();
    System.out.println(set2); // 1, 2, 3, 4, 5


  }
}
