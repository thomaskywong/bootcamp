package literalpool;

public class DemoString {
  public static void main(String[] args) {
    // Quiz
    String str1 = "hello"; // store in Literal Pool
    String str2 = "hello"; // check if "hello" exists in String Literal Pool
    // so that JVM can resue "hello" object by various object reference

    System.out.println(str2.equals(str1)); // true
    System.out.println(str1 == str2); // same address in String literal Pool-> true

    String str3 = "hello3";
    System.out.println(str3.equals(str1)); // false. different value
    System.out.println(str3 == str1); // false. different address

    String str4 = new String("hello"); // instantiate new String object
    System.out.println(str4.equals(str1)); // true, same value
    System.out.println(str4 == str1); // false. new keywords generate new object

    String str5 = String.valueOf("hello"); // Step 1: look up in literal pool. Use the same literal if found. new object if not found
    System.out.println(str5.equals(str1)); // true, same value
    System.out.println(str5 == str1); // true. "hello" exists in literal pool

    String str6 = String.valueOf("World");
    System.out.println(str6.equals(str1)); // false, different value
    System.out.println(str5 == str1); // false. instantiate new object since "World" does not exists in literal pool before

    if ("hello".equals(str1)) { // best practice to check the value of String. "hello" is never a null point
      System.out.println("str5 is equal to \"hello\""); // true
    }

    // Runtime error!
    // String str7 = null; // str6 is null.
    // if (str7.equals("hello")) { // exception. str6 cannot call .equals since cannot call method from null object
    // System.out.println("It is bad practice to check string value."); // throw exception. will not be executed
    // }

    // Concatenation
    String str7 = "abc";
    String str8 = str7 + "def"; // there will be2 string objects in literal pool
    System.out.println(str7 == str8); // false
    System.out.println(str7.hashCode());
    System.out.println(str8.hashCode());


    String str9 = "aaa";
    String str10 = new String("aaabbb");
    String str11 = "aaabbb";
    System.out.println(str10 == str11); // false. new String creates new objects

    String str12 = "aaa";
    String str13 = new String("aaabbb").intern(); // Check if exists in literal pool. Create object in literal pool
    String str14 = "aaabbb";
    System.out.println(str13 == str14); // true
    System.out.println((str13 == str11)); // true

    


  }
}
