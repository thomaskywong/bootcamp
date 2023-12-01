public class PractiseWrapperClassCasting {
  public static void main(String[] args) {
    
    // conversion between wrapper classes ( 8 classes)
    // Integer <-> Long
    // auto box int to Integer, assign to Integer object int1
    Integer int1 = 2312;                // auto box from int -> Integer
    
    // auto unbox from Integer to int
    int int2 = int1;
    
    // Integer -> Long
    // Step 1: Explicity cast Integer to int: (int) int1;
    // Step 2: Explicity cast int to long: (long) (int) int1;
    // Step 3: auto box from long to Long, assign to Long l1: Long l1 = (long) (int) int1; 
    Long l1 = (long) (int) int1;        // explicit casting required for conversion between wrapper class

    System.out.println("Integer -> Long: " + l1);

    // Long -> Integer. Down cast, may cause overflow!
    Long l2 = 23_123L;                    // auto box. Must use L notation for Long value
    Integer int3 = (int) (long) l2;       // explicit casting from Long to long, step 2:               
    System.out.println("Long l2 = " + l2);
    System.out.println("Long -> Integer int2 = (int) (long) l2 -> " + int3);
    
    // overflow
    Long l3 = Long.MAX_VALUE;           // auto box long -> Long
    Integer int4 = (int) (long) l3;     // explicit down casting, then auto box. Long -> Integer Overflow occurs 
    System.out.println("Long l3 = " + l3);
    System.out.println("Long -> Integer int4 = (int) (long) l3 -> " + int4); 


    // Float -> Double
    Float f1 = 3.1415f;                 // auto box
    Double d1 = (double) (float) f1;    // explicit up casting, then auto unbox. have precission error
    System.out.println("Float f1 = " + f1);
    System.out.println("Float -> Double d1 = (double) (float) f1 -> " + d1);    
    
    // Double -> Float (may cause overflow)
    Double d2 = Math.PI;                // auto box
    Float f2 = (float) (double) d2;     // explicit down casting, then auto unbox. have precision loss when down cast
    System.out.println("Double d2 = " + d2);
    System.out.println("Double -> Float f2 = (float) (double) d2 -> " + d2);

    // Byte -> Integer
    Byte b1 = 127;                      // auto box
    Integer int5 = (int) (byte) b1;     // explicit casting, then auto unbox
    System.out.println("Byte b1 = " + b1);
    System.out.println("Byte -> Integer int5 = (int) (byte) b1 -> " + int5);    

    // Integer -> Byte
    // overflow
    Integer int6 = Integer.MAX_VALUE;     // auto box
    Byte b2 = (byte) (int) int6;          // explicit casting, then auto unbox
    System.out.println("Integer int6 = " + int6);
    System.out.println("Integer -> Byte b2 = (byte) (int) int6 -> " + b2);

    // Character -> Integer
    Character c1 = 'Z';                         // auto box, ASCII = 90
    Integer int7 = (int) (char) c1;             // explicit casting, then auto unbox
    System.out.println("Character c1 = " + c1);
    System.out.println("Character -> Integer int7 = (int) (char) c1 -> " + int7);    

    // Integer -> Character
    // overflow, recycle to ASCII = 0
    Integer int8 = 99;                          // auto box. ASCII of 'c'             
    Character c2 = (char) (int) (int8 + 65535); // overflow, cycle to 'b'
    System.out.println("Integer int8 = " + int8 );
    System.out.println("Integer -> Character c2 = (char) (int) (int8 + 65535) -> " + c2);    
   





  }
}
