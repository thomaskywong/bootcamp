import java.util.Arrays;

public class PractiseValueConver {
  public static void main(String[] args) {
    
    // String.valueOf()
    String s1 = String.valueOf(10);           // int -> String
    System.out.println("int -> String: " + s1);

    String s2 = String.valueOf(20.0d);        // double -> String
    System.out.println("double -> String: " + s2);

    String s3 = String.valueOf(30.0f);        // float -> String
    System.out.println("double -> String: " + s3);

    String s4 = String.valueOf(400L);         // long -> String
    System.out.println("long -> String: " + s4);

    String s5 = String.valueOf((byte) 127);   // byte -> String
    System.out.println("byte -> String: " + s5);

    char[] cArray = new char[] {'a', 'b', 'c', 'd', 'e'};
    String s6 = String.valueOf(cArray);       // char[] -> String
    System.out.println("char[] -> String: " + s6);

    String s7 = String.valueOf(true);         // boolean -> String
    System.out.println("boolean -> String: " + s7);
    System.out.println();


    // String -> wrapper class using valueOf()
    // Used to convert tokens to numercial values
    // String -> Integer using valueOf()
    Integer int1 = Integer.valueOf("20");     // String -> Integer
    System.out.println("String -> Integer: " + int1);

    // String -> Long using valueOf()
    Long l1 = Long.valueOf("2323");          // String -> Long. cannot use L notation in String
    System.out.println("String -> Long: " + l1);

    // String -> Byte 
    Byte b1 = Byte.valueOf("127");            // String -> Byte.
    System.out.println("String -> Byte: " + b1);

    // String -> Short
    Short sh1 = Short.valueOf("32767");       // String -> Short
    System.out.println("String -> Short: " + sh1);

    // String -> Float
    Float f1 = Float.valueOf("23213.23");     // String -> Float
    System.out.println("String -> Float: " + f1);

    // String -> Double
    Double d1 = Double.valueOf("1212646.156465"); // String -> Double
    System.out.println("String -> Double: " + d1);

    // String -> Boolean
    Boolean b01 = Boolean.valueOf("false");        // String -> Boolean
    System.out.println("String -> Boolean: " + b01);

    // String -> Character DOES NOT EXIST!!!
    // char -> Character
    Character c01 = Character.valueOf('c');       // char -> Character. Cannot accept String!
    Character c03 = 'c';                          // auto boxing
    System.out.println("char -> Character.valueOf(): " + c01);
    System.out.println("char -> Character (auto boxing): " + c03 );     

    System.out.println();

    // String -> primitive (token -> primitive)
    // String -> int using parseInt()
    int int2 = Integer.parseInt("20");        // String -> int
    System.out.println("String -> int: " + int2);

    // String -> long using parseLong()
    long l2 = Long.parseLong("3000");         // String -> long
    System.out.println("String -> long: " + l2);

    // String -> double using parseDouble()
    double d2 = Double.parseDouble("2.323");  // String -> double
    System.out.println("String -> double: " + d2);

    // String -> float using parseFloat()
    float f2 = Float.parseFloat("3.4141");    // String -> float
    System.out.println("String -> float: " + f2);

    // String -> char []  using String.toCharArray()
    char[] c2 = "Thomas".toCharArray();          // String -> char[]
    System.out.println("String -> char[]: " + Arrays.toString(c2));
  }  
}
