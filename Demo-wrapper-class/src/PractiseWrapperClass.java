public class PractiseWrapperClass {
  public static void main(String[] args) {
    // 8 Wrapper Classes
    // Boolean, Character, Byte, Short, Integer, Long, Float, Double

    // boolean -> Boolean
    boolean b1 = true;
    Boolean b2 = Boolean.valueOf(b1);           // self-box
    Boolean b3 = Boolean.valueOf(false);        // .valueOf()
    Boolean b4 = new Boolean(true);             // Constructor
    Boolean b5 = false;                         // Auto-box
    Boolean b6 = b1;                            // Auto-box          

    // .compareTo()
    System.out.println(b2.compareTo(b1));       // True -> return 0
    System.out.println(b3.compareTo(b2));       // false.compareTo(true) = -1 (false = 0; true = 1)
    System.out.println(b2.compareTo(b3));       // true.compareTo(false) = 1 (true = 1, false = 0)
    System.out.println();

    //byte -> Byte
    byte byte1 = 1;
    Byte byte2 = Byte.valueOf(byte1);           // self-box
    Byte byte3 = Byte.valueOf((byte) -23);       // int -> byte requires explicit casting
    Byte byte4 = new Byte((byte) 123);          // Constructor
    Byte byte5 = -128;                          // autobox and auto down cast

    System.out.println(byte2.compareTo(byte1)); // equals -> return 0
    System.out.println(byte3.compareTo(byte2)); // negative.compareTo(positive) -> return diff = -24
    System.out.println(byte2.compareTo(byte5));  // positive.compareTo(negative) -> return diff = 129
    System.out.println();

    // short -> Short
    short s1 = 5344;                            // auto box
    Short s2 = Short.valueOf(s1);               // static method
    Short s3 = Short.valueOf((short) -2312);    // self box and auto down cast
    Short s4 = new Short((short) 23221);        // Constructor
    Short s5 = -231;                            // auto box and auto down cast
    System.out.println(s2.compareTo(s1));       // equals -> return 0
    System.out.println(s3.compareTo(s2));       // negative.compareTo(positive) -> return difference -2312 - 5344 = -7656
    System.out.println(s2.compareTo(s5));       // positive.compareTo(negative) -> return difference 5344 - (-231) = 5575
    System.out.println();

    // int -> Integer
    int int1 = 2300;
    Integer int2 = Integer.valueOf(int1);        
    Integer int3 = Integer.valueOf(-2311);      // self-box
    Integer int4 = new Integer(1243);           // Constructor
    Integer int5 = -3231;                       // auto-box
    System.out.println(int2.compareTo(int1));   // equals -> return 0
    System.out.println(int3.compareTo(int2));   // negative.compareTo(positive) -> return -1
    System.out.println(int2.compareTo(int5));   // positive.compareTo(negative) -> return 1
    System.out.println();

    // long -> Long
    long long1 = 1000L;                           // auto box
    Long long2 = Long.valueOf(long1);           
    Long long3 = Long.valueOf(-1010L);           // self box
    Long long4 = new Long(2000L);                 // Constructor
    Long long5 = -3000L;                         // auto box
    
    System.out.println(long2.compareTo(long1));  // equals -> return 0
    System.out.println(long3.compareTo(long2));   // negative.compareTo(positive) -> return -1
    System.out.println(long2.compareTo(long5));   // positive.compareTo(negative) -> return 1
    System.out.println();

    // float -> Float
    float f1 = 1.23f;
    Float f2 = Float.valueOf(f1);                 // auto box
    Float f3 = Float.valueOf(-3231.312f);         // self box
    Float f4 = new Float(-2.134f);                // Constructor
    Float f5 = 321.3f;                           // auto box

    System.out.println(f2.compareTo(f1));         // equals -> return 0
    System.out.println(f3.compareTo(f2));         // negative.compareTo(positive) -> -1
    System.out.println(f5.compareTo(f3));         // positive.compareTo(negative) -> 1
    System.out.println();
    
    // double -> Double
    double d1 = 1.23d;
    Double d2 = Double.valueOf(d1);               // static method
    Double d3 = Double.valueOf(-3231.312d);       // self box
    Double d4 = new Double(-2.134d);              // Constructor
    Double d5 = 321.3d;                           // auto box

    System.out.println(d2.compareTo(d1));         // equals -> return 0
    System.out.println(d3.compareTo(d2));         // negative.compareTo(positive) -> -1
    System.out.println(d5.compareTo(d3));         // positive.compareTo(negative) -> 1
    System.out.println();
    
    // char -> Character
    char c1 = 'A';
    Character c2 = Character.valueOf(c1);         
    Character c3 = Character.valueOf('a');        // self cast
    Character c4 = new Character('B');            // Constructor
    Character c5 = 'b';                           // auto cast

    System.out.println(c2.compareTo(c1));         // equals -> return 0
    System.out.println(c3.compareTo(c2));         // higher_ASCII.compareTo(lower_ASCII) -> return difference 97 - 65 = 32
    System.out.println(c5.compareTo(c3));         // lower_ASCII.compareTo(higher_ASCII) -> return difference 98 - 97 = 1
    System.out.println();
    
    // String
    String str1 = "Hello World!";                     // auto box
    String str2 = String.valueOf(str1);               // static method
    String str3 = String.valueOf("hello World!");     // self box
    String str4 = new String("Hello World");          // constructor
    
    System.out.println(str2.compareTo(str1));         // equals -> 0
    System.out.println(str3.compareTo(str1));         // compare the left most difference character = 'h' - 'H' = 32
    System.out.println(str4.compareTo(str1));         // compare the length between two string if one string is substring of another



    
  }



}
