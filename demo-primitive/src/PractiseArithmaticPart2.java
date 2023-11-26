public class PractiseArithmaticPart2 {
  public static void main(String[] args) {
    
    // * , *= operation
    System.out.println("* , *= operation:");
    double d1 = 2312.1232d;
    double d2 = 1000d;
    double d3 = d1 * d2;
    System.out.println("double d1 = " + d1 + "\ndouble d2 = " + d2);
    System.out.println("double d3 = d1 * d2");
    System.out.println("d3 = " + d3);
    System.out.println();

    float f1 = 231.0f;
    int k1 = 5;
    double d4 = f1 * k1;
    System.out.println("float f1 = " + f1 + "\nint k1 = " + k1);
    System.out.println("double d4 = f1 * k1");
    System.out.println("d4 = " + d4);
    System.out.println();

    double d5 = 1.132324d;
    int factor = 1000;
    System.out.println("double d5 = " + d5 + "\nint factor = " + factor);
    d5 *= factor;
    System.out.println("d5 *= factor \t//means d5 = d5 * factor");
    System.out.println("d5 = " + d5);
    System.out.println();

    // / , /= operation
    System.out.println("/ , /= operation:");
    d1 = 2312.1232d;
    d2 = 100d;
    d3 = d1 / d2;
    System.out.println("double d1 = " + d1 + "\ndouble d2 = " + d2);
    System.out.println("double d3 = d1 / d2");
    System.out.println("d3 = " + d3);
    System.out.println();

    f1 = 231.0f;
    k1 = 5;
    d4 = f1 * k1;
    System.out.println("float f1 = " + f1 + "\nint k1 = " + k1);
    System.out.println("double d4 = f1 / k1");
    System.out.println("d4 = " + d4);
    System.out.println();

    d5 = 11323.24d;
    factor = 1000;
    System.out.println("double d5 = " + d5 + "\nint factor = " + factor);
    d5 /= factor;
    System.out.println("d5 /= factor \t//means d5 = d5 / factor");
    System.out.println("d5 = " + d5);
    System.out.println();

    // quotient of division assign to int
    System.out.println("Quotient of division assign to int");
    int int1 = 12345;
    int int2 = 10;
    int int3 = int1 / int2;
    System.out.println("int int1 = " + int1);
    System.out.println("int int2 = " + int2);
    System.out.println("int int3 = int1/int2; ");
    System.out.println("int1/int2 = " + int1/int2);
    System.out.println("int3 = " +int3);
    System.out.println("Since the result datatype is int, the quotient result will be truncated");
    System.out.println("to integer.");
    System.out.println();

    // % modulus operator returns the remainder of dividing 2 integers (dividend and divisor)
    System.out.println("% operator returns the remainder of dividing 2 integers");
    int1 = 100;
    int2 = 13;
    int remainder = 0;
    remainder = int1 % int2;
    System.out.println( int1 + " % " + int2 + " = " + remainder);
    System.out.println(remainder + " is the remainder of " + int1 + " % " + int2);
    System.out.println();

    System.out.println("Exercise:");
    System.out.println("14 + 23 * 32 % 16 - 18 / 2");
    System.out.println("= 14 + 736 % 16 - 9");
    System.out.println("= 14 + 0 - 9");
    System.out.println("= 14 - 9");
    System.out.println("= 5");
    double result = 14 + 23 * 32 % 16 - 18 / 2;       // 14 + 736 % 16 - 9 -> 14 + +0 - 9 -> 14 - 9 -> 5.0d
    System.out.println(result);
    System.out.println();

    System.out.println("Exercise 2:");
    System.out.println("int a = 3");
    System.out.println("int b = (a++ + 3) * a++");
    System.out.println("step 1: (a++ + 3) = 3 + 3 = 6");
    System.out.println("step 2: a++ -> a = 4");
    System.out.println("step 3: b = 6 * a++ = 6 * 4 = 24");
    System.out.println("step 4: a++ -> a = a + 1 = 4 + 1 = 5");
    System.out.println("Therefore");
    System.out.println("b = 24");
    System.out.println("a = 5");
    System.out.println();
    int a = 3;
    int b = (a++ + 3) * a++;
    System.out.println("b = " + b + ", a = " + a);


  }
  
}
