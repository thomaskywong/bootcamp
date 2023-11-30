public class PractiseWrapperClassConver {

  public static void main(String[] args) {

    // Wrapper class does not support implicit casting 
    // Integer -> long
    Integer int1 = 231;             // auto box 
    long l1 = (long) (int) int1;    // explicit cast
    int int01 = int1.intValue();    // un-box
    int int02 = int1;               // auto un-box
    System.out.println(l1);
    System.out.println();

    // Long -> integer
    Long l2 = -2312L;               // auto box
    int int2 = (int) (long) l2;     // explicit cast, down cast may cause overflow
    System.out.println(int2);
    System.out.println();

    // Integer -> char
    Integer int3 = Integer.valueOf(65);
    char c3 = (char) (int) int3;          
    System.out.println(c3);

    // Float -> double
    Float f4 = Float.valueOf(231.23f);
    double d4 = (double) (float) f4;
    System.out.println(d4);
    Double d5 = (double) (float) f4;

    
    // Double -> float
    Double d5 = Double.valueOf(231.23d);
    float f5 = (float) (double) d5;
    System.out.println(f5);

    // 

  }
  
}
