public class PractisePrimitive {

  public static void main(String[] args) {

    // Implicit casting, up casting
    // byte -> short -> int -> long -> float -> double
    // char -> int -> long -> float -> double

    byte b1 = 127;

    short s1 = b1; // byte -> short, OK
    System.out.println("s1 = " + s1 + "\n");

    int i1 = b1; // byte -> int, OK
    int i2 = s1; // short -> int, OK
    System.out.println("i1 = " + i1 + "\n");
    System.out.println("i2 = " + i2 + "\n");

    long l1 = b1; // byte -> long, OK
    long l2 = s1; // short -> long, OK
    long l3 = i1; // int -> long, OK
    System.out.println("l1 = " + l1 + "\n");
    System.out.println("l2 = " + l2 + "\n");
    System.out.println("l3 = " + l3 + "\n");

    long l4 = Integer.MAX_VALUE;
    System.out.println("l4 = " + l4 + "\n");
    long long1 = 10L;
    float float1 = long1; // long - float, but may cause precision loss
    System.out.println("long1 = " + long1);
    System.out.println("float1 = " + float1);

    long l5 = Long.MAX_VALUE;
    float f1 = l5; // long -> float, implicit casting can do, but precision loss by truncated scientific notation
    System.out.println("l5 = " + l5);
    System.out.println("f1 = " + f1); // Scientific notation

    double d1 = l5; // Long ->double, implicit casting can do, but precision loss by truncated scientific notation
    System.out.println("l5 = " + l5);
    System.out.println("d1 = " + d1); // Scientific notation

    float f2 = 21.1232f;
    double d3 = f2; // float -> double, implicit casting can do, but precision error
    System.out.println("f2 = " + f2);
    System.out.println("d3 = " + d3);

    // Down casting
    // Explicit casting required. OVERFLOW or PRECISION LOSS may occurs
    // double -> float
    double d4 = 1.3d;
    float f4 = (float) d4; // double -> float, down cast (float)
    System.out.println("d4 = " + d4);
    System.out.println("f4 = " + f4);

    d4 = (double) Long.MAX_VALUE;
    f4 = (float) d4; // explicit down cast, precision loss with truncated scientific
    System.out.println("d4 = " + d4);
    System.out.println("f4 = " + f4);

    // float -> int
    float f5 = 2312.43f;
    int i5 = (int) f5; // float -> int, down cast (int), precision loss
    System.out.println("f5 = " + f5);
    System.out.println("i5 = " + i5);             // float is truncated with integer

    // float -> long
    float f6 = 2312.43f;
    long l6 = (long) f6; // float -> long, down cast (long), precision loss
    System.out.println("f6 = " + f6);
    System.out.println("l6 = " + l6);             // float is truncated with integer

    // long -> int    
    long l7 =  (long) Integer.MAX_VALUE + 3;
    int i7 = (int) l7;                            // long -> int. Down cast (int). overflow can occurs
    System.out.println("l7 = " + l7);
    System.out.println("i7 = " + i7);             // overflow to negative number
    
    // int -> byte
    int i8 = 130;
    byte b8 = (byte) i8;                          // int -> byte. Down cast (int). overflow to negative number
    System.out.println("i8 = " + i8);
    System.out.println("b8 = " + b8);             // overflow by 3, therefore -128 > -127 > -126

    // int -> char
    int i9 = 65_600;
    char c1 = (char) i9;                          // int -> char, explicit downcast, overflow back to ASCII 0
    System.out.println("i9 = " + i9);
    System.out.println("c1 = " + c1);             // overflow by 3, therefore -128 > -127 > -126
  
  }

}
