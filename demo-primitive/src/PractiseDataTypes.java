public class PractiseDataTypes {
  public static void main(String[] args) {

    // Demonstration of different data types
    // primitive (8 types) boolean, byte, short, int, long, float, double, char
    // reference (1 type): String

    // boolean (1 bit)
    boolean isBoolean1 = true;
    boolean isBoolean2 = false;
    System.out.println("boolean1 = " + isBoolean1 + ", boolean2 = " + isBoolean2);
    System.out.println();


    // byte (8 bits)
    byte byte1 = -128;
    byte byte2 = 127;
    System.out.println("byte1 = " + byte1 + ", byte2 = " + byte2);
    System.out.println();

    // short (16 bits)
    short short1 = -32_768;
    short short2 = 32_767;
    System.out.println("short1 = " + short1 + ", short2 = " + short2);
    System.out.println();

    // int (32 bits), default datatype of integer in Java
    int int1 = -2_147_483_648; // -2.1E9 or -(2^31)
    int int2 = 2_147_483_647; // 2.1E9 or (2^31)-1
    System.out.println("int1 = " + int1 + ", int2 = " + int2);
    System.out.println();

    // long (64 bits). use 'L' notation to indicate long integer
    long long1 = -9_223_372_036_854_775_808L; // -9.2E18
    long long2 = 9_223_372_036_854_775_807L; // 9.2E18
    System.out.println("long1 = " + long1 + ", long2 = " + long2);
    System.out.println();

    // float (32 bits). use 'f' notation to indicate floating point
    float float1 = -0.2124f; 
    float float2 = 56461231.12656f;
    System.out.println("float1 = " + float1 + ", float2 = " + float2);
    System.out.println();
    
    // double (64 bits). Decimal numbers are double as default
    double double1 = 10.2124; 
    double double2 = -61231.12656d;   // use d notation to indicate double
    System.out.println("double1 = " + double1 + ", double2 = " + double2);
    System.out.println();

    // char (16 bits). use ' ' to indicate char. '' is not a valid char
    char char1 = '@'; 
    char char2 = ' ';
    char char3 = '1';
    char char4 = 'A';
    char char5 = 'c';
    char char6 = 3;          // unicode value of a character
    System.out.println("char1 = " + char1);
    System.out.println("char2 = " + char2);
    System.out.println("char3 = " + char3);
    System.out.println("char4 = " + char4);
    System.out.println("char5 = " + char5);
    System.out.println("char6 = " + char6);
    System.out.println();

    // String. Not a primitive type. Store the address of a String object located in heap memory
    String str1 = null;    // string1 point to no where
    System.out.println("str1 = " +str1);
    String str2 = "abcdefghi";
    System.out.println("str2 = " +str2);
    String str3 = "Hello";
    String str4 = "World!";
    System.out.println(str3 + " " + str4);
    System.out.println();

    String str5 = str2;
    System.out.println("String str5 = str2");
    System.out.println("Address of str2 object in heap memory = " + str2.hashCode());
    System.out.println("Address of str5 object in heap memory = " + str5.hashCode());


  }

}

