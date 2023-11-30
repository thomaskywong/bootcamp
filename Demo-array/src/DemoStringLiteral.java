public class DemoStringLiteral {

  public static void main(String[] args) {
    String s1 = "John";
    String s2 = "John";

    // s1.equals(s2) true (same value)
    System.out.println(s1.equals(s2)); // true, since same value
    
    // ==, check if they are same object (same address)
    System.out.println(s1 == s2); // true, since literal, share same address

    String s3 = new String("John"); // new object with the same string value
    System.out.println(s1 == s3); // false, since store at different address locaton

    String s4 = String.valueOf("John");   
    System.out.println(s1.equals(s4));    // true, two string value are the same
    System.out.println(s1 == s4);         // true
    System.out.println(s3 == s4);         // false

    s1 = "John2";                         // new string literal object
    System.out.println(s1 == s4);         // false

    System.out.println("s2 = " + s2);     // "John"
    s2 = s2.concat("2");                        // concat create new String object. "John" + "2" -> "John2"
    System.out.println("s2 + \"2\" = \"John2\"");
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println(s1 == s2);         // false. .concat() methods use new String() constructor

    s2 = String.valueOf("John2");
    System.out.println(s1 == s2);         // true

  }

}
