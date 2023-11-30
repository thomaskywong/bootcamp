public class DemoOperator {

  public static void main(String[] args) {

    int x = 2;
    x++; // x = x + 1 (=3)
    ++x; // x = x + 1 (=4)
    x += 1; // x = x + 1 (=5)
    x = x + 1; // x = x + 1 (=6)

    // difference between post-increment a++ and pre-incremenet ++a
    int a = 5;
    System.out.println("a = " + a);
    int preIncrement = ++a; // first a = a + 1 (=6), then preIncrement = a (=6)
    System.out.println("Do preIncrement = ++a");
    System.out.println("preIncrement = " + preIncrement);
    System.out.println("a = " + a);
    System.out.println();

    int b = 5;
    System.out.println("b = " + b);
    int postIncrement = b++; // first postIncrement = b (=5), then b = b + 1 (=6)
    System.out.println("Do postIncrement = b++");
    System.out.println("postIncrement = " + postIncrement);
    System.out.println("b = " + b);
    System.out.println();

    // difference between post-decrement c-- and pre-decremenet --c
    int c = 5;
    System.out.println("c = " + c);
    int preDecrement = --c; // first c = c - 1 (=4), then preDecrement = c (=4)
    System.out.println("Do preDecrement = --c");
    System.out.println("preDecrement = " + preDecrement);
    System.out.println("c = " + c);
    System.out.println();

    int d = 5;
    System.out.println("d = " + d);
    int postDecrement = d--; // first postDecrement = d (=5), then d = d - 1 (=4)
    System.out.println("Do postDecrement = d--");
    System.out.println("postDecrement = " + postDecrement);
    System.out.println("d = " + d);
    System.out.println();

    // Conditional Operator
    // && and, || or, ! not
    a = 2;
    b = 4;

    // && AND operation
    // &&, if left side is false, right side will not be executed
    if (a == 2 && b == 4) // and relationship, both conditions are true
      // a == 2 is true
      // b == 4 is true
      // true AND true -> true
      System.out.println("yes");
    else
      System.out.println("no");

    // || Or operation
    // ||, if right side is true, right side will not be executed
    if (a == 2 || b == 5) // or relationship, either one condition is true
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
    if (a == 5 && (b == 4 || "Hello".equals(str))) {
      // a == 5 is true
      // b == 4 is false
      // "Hello".equals(str) is true
      // since () proceeds first
      // (b== 4 || "Hello".equals(str)) is true
      // true && true -> true
      System.out.println("yes");
    } else {
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
    } else {
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
    if (c == 1 || b == 4 && "hello".equals(str)) {
      // && operator has higher priority than ||
      // b == 4 -> false
      // && hello".equals(str) will not be executed
      // c == 2 -> true
      // true || false -> true
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    c = 1;
    b = 5;
    if (c == 2 || b == 4 && "hello".equals(str)) {
      // && operator has higher priority than ||
      // b == 4 -> false
      // && hello".equals(str) will not be executed
      // c == 2 -> false
      // false || false -> false
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    String h = "Hello";
    b = 6;
    System.out.println(h); // h = "Hello"
    // h.charAt(3) is 'l'
    // h.charAt(3) == 'e' is false
    // b == 6 is true
    // false || true -> true
    // || Or, if the left side is true, right side will not be executed 
    if (h.charAt(3) == 'e' || b == 6) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    // Ternary condition
    boolean b1 = false;
    int g = 0;
    if (b1 == false) {
      g = 10;
    }

    // use ternary condition
    // check if b1 is true or false
    // if b1 is true, g = 0
    // else if b1 is false, g =10
    // int g = b1 ? 0 : 10;

    b1 = true;
    // (b1 == false) is true, k = 10
    // else if (b1 == false) is false, k = 0
    // since b1 is true, (b1 == false) is false, so k = 0
    int k = b1 == false ? 10 : 0;
    System.out.println("k = " + k);

    b1 = true;
    // (b1 == false) is true, k = 10
    // else if (b1 == false) is false, k = 0
    // since b1 is true, (b1 == false) is false, so k = 0
    k = b1 == false ? 10 : 0;
    System.out.println("k = " + k);
    System.out.println();

    if (b1 == false) {
      k = 10;
      System.out.println("b1 = " + b1);
      System.out.println("k = " + k);
    } else {
      k = 0;
      System.out.println("b1 = " + b1);
      System.out.println("k = " + k);
    }

    int a1 = 10;
    int a2 = 4;

    int min = a1 < a2 ? a1 : a2;
    System.out.println();
    System.out.println("min = " + min);

    if (a1 < a2)
      min = a1;
    else
      min = a2;
    System.out.println("min = " + min);

    System.out.println("min = " + Math.min(a1, a2));

    int number = 14;
    boolean isOdd = (number % 2) != 0 ? true : false;
    System.out.println("Odd Number: " + isOdd); // odd number is true
    System.out.println();

    // if itemTotal > 3000, no delivery fee, otherwise x 3% as transportation fee
    double totalAmount = 0.0;
    // double deliveryFee = 0.0;
    final double DELIVERYRATE = 0.03;
    int itemTotal = 2_211;

    // if (itemTotal <= 3_000)
    // deliveryFee = itemTotal * DELIVERYRATE;
    // since deliveryFee is initialized as 0, no else statement is needed

    double deliveryFee = (itemTotal > 3000) ? 0 : (itemTotal * DELIVERYRATE);

    totalAmount = itemTotal + deliveryFee;

    System.out.println("Subtotal= " + itemTotal);
    System.out.println("Delivery Fee= " + deliveryFee);
    System.out.println("Total Amount = " + totalAmount);

    // >, <, >=, <=, !
    boolean isPassed = false;
    if (!isPassed) {
      System.out.println("isPassed = false");
    }

    isPassed = true; // re-assigned
    // isPassed = 1; // cannot change type. invalid
    if (isPassed) {
      System.out.println("isPassed = true");
    }

    String string1 = "www.apple.com";
    // || OR operator. If the left side is true, right side will not be executed
    if (string1.length() < 10 || "www.apple.com".equals(string1)) {
      System.out.println("length < 10 or www.apple.com");
    }

    String s = ""; // empty string, length() = 0;
    String s2 = " "; // NOT empty string, length() = 1;

    s += "hello";
    // String.isEmpty(). check if string is emplty or lenght=0. return true or false
    System.out.println(s);
    if (s.isEmpty()) {
      System.out.println("It is an empty string.");
    } else {
      System.out.println("It is not an empty string");
    }

    s = "";
    if (! s.isEmpty()) {
      System.out.println("It is NOT an empty string.");
    } else {
      System.out.println("It is an empty string");
    }



  }

}
