public class PractiseWrapperClassConver {

  public static void main(String[] args) {

    // Wrapper class does not support implicit casting 
    // Integer -> long
    Integer int1 = Integer.valueOf(231);
    long l1 = (long) (int) int1;
    System.out.println(l1);
    System.out.println();

    // Long -> integer
    Long l2 = Long.valueOf(-2312L);
    int int2 = (int) (long) l2;
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

    
    // Double -> float
    Double d5 = Double.valueOf(231.23d);
    float f5 = (float) (double) d5;
    System.out.println(f5);

    // 

  }
  
}
