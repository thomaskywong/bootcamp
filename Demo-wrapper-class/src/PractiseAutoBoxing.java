public class PractiseAutoBoxing {

  public static void main(String[] args) {

    // Long < - > long
    Long l1 = 123123L; // Auto boxing
    Long l2 = 123123L;  // Auto boxing
    long l3 = l1; // auto unboxing
    Long l4 = Long.valueOf(123123); // self box
    System.out.println(l1.equals(l3));    // true, always use .equals() for wrapper class comparison

    // Integer < - > int
    Integer int1 = 3231;          // Auto boxing
    int int2 = int1;              // auto unboxing
    System.out.println(int1.equals(int2));

    // Short < - > short
    Short s1 = 1232;            // Auto boxing
    short s2 = s1;              // auto unboxing
    System.out.println(s1.equals(s2));

    // Byte < - > byte
    Byte byte1 = 123;            // Auto boxing
    byte byte2 = byte1;          // auto unboxing
    System.out.println(byte1.equals(byte2));

    // Double < - > double
    Double d1 = 231.3d;            // auto boxing
    double d2 = d1;                // auto unboxing
    System.out.println(d1.equals(d2));

    // Float < - > float
    Float f1 = 3.1415f;            // auto boxing
    float f2 = f1;                // auto unboxing
    System.out.println(f1.equals(f2));

    // Boolean < - > boolean
    Boolean boo1 = false;               // auto boxing
    boolean boo2 = boo1;                // auto unboxing
    System.out.println(boo1.equals(boo2));    

  }
}
