package Staticvariable;

import java.util.Arrays;

public class Database {

  private static String[] strings = new String[0];

  private final int hours_per_day = 24; // Constant instance value

  // final vs. static final
  // 1. "final" is still instance variable. The object can call it by "this"
  // 2. "static final" is constant. Class constant. The constant can be called by "Class."

  // Variables:
  // No static, No final (instance variable)
  // static (class variable)
  // final (instance variable that cannot be changed)
  // static final (constant. class constant)
                                                               

  private static final int MINUTES_PER_HOUR = 60//  Constant 

  public static void add(String str) {

    String[] newArr = Arrays.copyOf(strings, strings.length + 1);
    newArr[newArr.length - 1] = str;
    strings = newArr;

  }

  public static boolean remove(int index) {

    if (!isIndexValid(index)) {
      return false;
    }

    int idx = 0;

    String[] newArr = new String[strings.length - 1];
    for (int i = 0; i < strings.length; i++) {
      if (index == i) {
        continue;
      }

      newArr[idx++] = strings[i];
    }
    strings = newArr;

    return true;
  }

  public static String get(int index) {
    if (!isIndexValid(index)) {
      return null;
    }

    return strings[index];

  }

  public String read(int index) {
    if (!isIndexValid(index)) {
      return null;
    }

    return strings[index];
  }


  @Override
  public String toString() {

    if (strings.length == 0) {
      return "";
    }

    String output = "";

    for (int i = 0; i < strings.length; i++) {
      // System.out.println(strings[i]);
      output = output.concat(strings[i]).concat(" ");
    }

    return output;
  }

  // refactor duplicating code
  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }

  public static void main(String[] args) {

    System.out.println(Database.get(0));
    System.out.println(Database.remove(0));

    Database.add("Thomas");
    Database.add("Yan");
    Database.add("Constantine");

    System.out.println(Database.get(0)); // Thomas
    System.out.println(Database.remove(3)); // false
    System.out.println(Database.get(2)); // Constantine
    System.out.println(Database.remove(1)); // true
    System.out.println(Database.get(2)); // null

    Database database1 = new Database();
    Database database2 = new Database();

    System.out.println(database1.toString()); // Thomas Constantine
    System.out.println(database2.toString()); // Thomas Constantine

    System.out.println(Database.remove(1)); // true
    System.out.println(database1.toString()); // Thomas

    Database.add("Yan");
    System.out.println(database1.toString()); // Thomas Yan
    System.out.println(database2.toString()); // Thomas Yan

    System.out.println(Database.get(0)); // Thomas
    System.out.println(Database.get(1)); // Yan

    System.out.println(Database.remove(0)); // true
    System.out.println(Database.get(0)); // Yan
    System.out.println(Database.get(1)); // null

    Database.add("Tim");
    System.out.println(Database.get(0)); // Yan
    System.out.println(Database.get(1)); // Tim

    System.out.println(database1.toString()); // Yan Tim
    System.out.println(database1.read(0));    // Yan
    System.out.println(database1.read(1));    // Tim
    Database.remove(0);
    System.out.println(database1.read(1));    // null
    System.out.println(database1.read(0));    // Tim





  }

}
