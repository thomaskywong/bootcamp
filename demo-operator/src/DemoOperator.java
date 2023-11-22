public class DemoOperator {

  public static void main(String[] args) {
    
    int x =2;
    x++;        // x = x + 1 (=3)
    ++x;        // x = x + 1 (=4)
    x += 1;     // x = x + 1 (=5)
    x = x + 1;  // x = x + 1 (=6)

    // difference between post-increment a++ and pre-incremenet ++a
    int a = 5;
    System.out.println("a = "+a);
    int preIncrement = ++a;     // first a = a + 1 (=6), then preIncrement = a (=6)
    System.out.println("Do preIncrement = ++a");
    System.out.println("preIncrement = " + preIncrement);
    System.out.println("a = " + a);
    System.out.println();

    int b = 5;
    System.out.println("b = "+b);
    int postIncrement = b++;    // first postIncrement = b (=5), then b = b + 1 (=6)
    System.out.println("Do postIncrement = b++");
    System.out.println("postIncrement = " + postIncrement);
    System.out.println("b = " + b);
    System.out.println();

    // difference between post-decrement c-- and pre-decremenet --c
    int c = 5;
    System.out.println("c = "+c);
    int preDecrement = --c;     // first c = c - 1 (=4), then preDecrement = c (=4)
    System.out.println("Do preDecrement = --c");
    System.out.println("preDecrement = " + preDecrement);
    System.out.println("c = " + c);
    System.out.println();

    int d = 5;
    System.out.println("d = "+d);
    int postDecrement = d--;    // first postDecrement = d (=5), then d = d - 1 (=4)
    System.out.println("Do postDecrement = d--");
    System.out.println("postDecrement = " + postDecrement);
    System.out.println("d = " + d);
    System.out.println();

    // Conditional Operator
    // && and, || or, ! not
    a = 2; 
    b = 4;

    // && AND operation
    if (a == 2 && b == 4)           // and relationship, both conditions are true 
   // a == 2 is true
   // b == 4 is true
   // true AND true -> true
      System.out.println("yes");
    else
      System.out.println("no");

    // || Or operation
    if (a == 2 || b == 5)           // or relationship, either one condition is true 
    // a == 2 is true
    // b == 5 is false
    // true OR false -> true
      System.out.println("yes");
    else
      System.out.println("no");


    // AND && and OR ||
    a = 5;
    b = 6;
    String str = "Hello";
    if (a == 5 && (b== 4 || "Hello".equals(str))) {
    // a == 5 is true
    // b == 4 is false
    // "Hello".equals(str) is true
    // since () proceeds first
    // (b== 4 || "Hello".equals(str)) is true
    // true && true -> true
      System.out.println("yes");
    }
    else {
      System.out.println("no");
    }

    a = 5;
    b = 6;
    str = "Hello";
    if (b == 4 && a == 5 || "Hello".equals(str)) {
    // b == 4 is false
    // a == 5 is true
    // b == 4 && a == 5 is false, but since || operator exists, will continue evaluate the rest 
    // since "Hello".equals(str) is true
    // true && false || true
    // false || true
    // false || true -> true
      System.out.println("yes");
    }
    else {
      System.out.println("no");
    }

    if (b == 5 && a == 2)           
   // b == 5 is false
   // since && is AND operator. Once the left condition is false, the right side will not evaluate
   // b == 5 is false. a == 2 will NOT be executed
      System.out.println("yes");
    else
      System.out.println("no");

      c = 1;
      b = 5;
      if ( c == 1 || b == 4 && "hello".equals(str)) {
        // && operator has higher priority than ||
        // b == 4 -> false
        // && hello".equals(str) will not be executed
        // c == 2 -> true
        // true || false -> true
          System.out.println("yes");
      }
      else {
          System.out.println("no");
      }

      c = 1;
      b = 5;
      if ( c == 2 || b == 4 && "hello".equals(str)) {
        // && operator has higher priority than ||
        // b == 4 -> false
        // && hello".equals(str) will not be executed
        // c == 2 -> false
        // false || false -> false
          System.out.println("yes");
      }
      else {
          System.out.println("no");
      }

      String h = "Hello";
      b = 6;
      System.out.println(h); // h = "Hello"
      // h.charAt(3) is 'l' 
      // h.charAt(3) == 'e' is false
      // b == 6 is true
      // false || true -> true
      if (h.charAt(3) == 'e' || b == 6) {
          System.out.println("yes");
      }
      else {
          System.out.println("no");
      }
      



  }
  
}
