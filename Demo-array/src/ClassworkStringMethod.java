public class ClassworkStringMethod {

  public static void main(String[] args) {
    
    String s1 = "Hello";
    String s2 = " world!";
    
    String s3 = append(s1, s2);
    System.out.println(s3);
    System.out.println(length(s1, s2));
    System.out.println(getLastChar(s3));

    String prefix = "Hello";
    System.out.println(isStartWith(s1, prefix));

    String s4 = "abcbcdabc";
    String toBeRemove = "bcd";
    System.out.println(toBeRemove(s4, toBeRemove));
    System.out.println();

    System.out.println(sound2("Cat"));
    System.out.println(sound2("DOG"));
    System.out.println(sound2("Tiger"));
    System.out.println(sound2("Kangaroo"));
    System.out.println(sound2(""));
    System.out.println();

    
  }

  public static String sound2(String animal) {
    if ("".equalsIgnoreCase(animal))
      return "No sound...";        
    else if ("cat".equalsIgnoreCase(animal)) {
      return "MEOW";
    }
    else if ("dog".equalsIgnoreCase(animal)) {
      return "WOW";
    }
    
    return "Default sound...";
  }

  public static void sound(String animal) {
    if ("quit".equalsIgnoreCase(animal))
      return;           // Early return. return "nothing" -> void. 
    else if ("cat".equalsIgnoreCase(animal)) {
      System.out.println(animal + " MEOW");
      return;
    }
    else if ("dog".equalsIgnoreCase(animal)) {
      System.out.println(animal + " WOW");
      return;
    }
    
    System.out.println(animal + " not found!");
    
  }

  public static String append(String s1, String s2) {
      return s1.concat(s2);
  }

  public static char getLastChar(String s) {
    return s.charAt(s.length()-1);
  }
  
  public static int length(String s1, String s2) {
      return s1.length() + s2.length();
  }

  public static boolean isStartWith(String s, String prefix) {
    return prefix.startsWith(s);
  }

  public static String toBeRemove(String s, String toBeRemove) {
    return s.replace(toBeRemove, "");
  }
  
}
