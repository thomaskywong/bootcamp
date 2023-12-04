public class ReviewCasting {

  public static void main(String[] args) {
    // short overflow
    short s1 = 32_767;
    s1 += 1;
    System.out.println(s1);

    short s2 = (short) 32_768;
    System.out.println(s2);

    // overflow of byte
    int i = 128;
    byte j = (byte) i;
    System.out.println(j);

    // auto casting
    byte byte1= 10; // int -> byte OK
    System.out.println(byte1);
    short short1 = 10; // int -> short OK
    System.out.println(short1);

    float f1 = 10.0f;     // float number with f notation OK
    double d1 = 10.0d;    // double number with d nottation or without notation OK
    double d2 = 10.0f;    // float -> double OK
    // int k1 = 10L; // long -> int NOT OK
    // int k2 = 10.0f; // float 0

    int int1 = 1;
    byte byte01 = (byte) int1;        // int variable to byte, cannot auto cast
    byte byte02 = 10;                 // int literal to byte, auto casting ok
   
  }

}
