public class PractisePrimitive {

  public static void main(String[] args) {
    
    // Implicit casting, up casting
    // byte -> short -> int -> long -> float -> double
    // char -> int -> long -> float -> double

    byte b1 = 127;      
    
    short s1 = b1;        // byte -> short, OK
    System.out.println("s1 = " + s1 +"\n");

    int i1 = b1;          // byte -> int, OK
    int i2 = s1;          // short -> int, OK
    System.out.println("i1 = " + i1 + "\n");
    System.out.println("i2 = " + i2 + "\n");

    long l1 = b1;       // byte -> long, OK
    long l2 = s1;       // short -> long, OK
    long l3 = i1;       // int -> long, OK
    System.out.println("l1 = " + l1 + "\n");
    System.out.println("l2 = " + l2 + "\n");
    System.out.println("l3 = " + l3 + "\n");

    long l4 = Integer.MAX_VALUE;
    System.out.println("l4 = " + l4 + "\n");

    long l5 = Long.MAX_VALUE;
    float f1 = l5;      // long -> float, implicit cast can do, but precision loss
    System.out.println("l5 = " + l5);
    System.out.println("f1 = " + f1);         // Scientific notation



  }
  
}
