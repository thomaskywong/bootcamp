public class ExerciseStringMethod {

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
