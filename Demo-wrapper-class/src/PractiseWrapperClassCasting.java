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
    Long l2 = 23_123L;                   // auto box. Must use L notation for Long value
    Integer int3 = (int) (long) l2;     // step 1: explicit casting from Long to long, step 2:               
    System.out.println("Long l2 = " + l2);
    System.out.println("Long -> Integer int2: (int) (long) l2 -> " + int3);
    


    // Long <-> Integer (may cause overflow)
    // Float <-> Double 
    // Double <-> Float (may cause overflow)
    // Byte <-> Integer
    // Integer <-> Byte



  }
}
