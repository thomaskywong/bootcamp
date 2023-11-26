public class PractiseLogicalOperator {

  public static void main(String[] args) {
    // logical operation
    // ! (NOT), && (AND), || (OR)
    // Precedence: ! > && > ||
    
    // ! operator
    boolean isTrue = true;
    boolean isFalse = false;
    System.out.println("!isTrue = " + !isTrue);     // false
    System.out.println("!isFalse = " + !isFalse);   // true
    System.out.println();    

    boolean[] state = new boolean[] {true, false};
    // && (AND) operator
    for (int i = 0; i < 2; ++i)
      for (int j = 0; j < 2; ++j) 
        System.out.println(state[i] + " && " + state[j] + " -> " + (state[i] && state[j]));
    System.out.println();

    // || (OR) operator
    for (int i = 0; i < 2; ++i)
      for (int j = 0; j < 2; ++j) 
        System.out.println(state[i] + " || " + state[j] + " -> " + (state[i] || state[j]));
    System.out.println();
    
    // &&, || logical operator
    System.out.println("&& operator evaluates first");
      for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j) 
          for (int k = 0; k < 2; ++k)  
            System.out.println(state[i] + " || " + state[j] + " && " + state[k] + " -> " + (state[i] || state[j] && state[k]));
      System.out.println();

      System.out.println("&&, ||, ! operators");
      for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j) 
          for (int k = 0; k < 2; ++k)  
            System.out.println(state[i] + " || " + state[j] + " && !" + state[k] + " -> " + (state[i] || state[j] && !state[k]));
      System.out.println();

      //Remark: for && operator, given a == 1 && b < 2. if a == 1 is false, b < 2 will not be evaluate
      int a = 13;
      int b = 1;
      System.out.println("a = " + a + ", b = " + b );
      System.out.println("evaluates (a == 1) && (b < 2)");
      System.out.println("false && b < 2");
      System.out.println("b < 2 will not be executed");
      System.out.println(" -> false");
      System.out.println(a == 1 && b < 2);
      System.out.println();
   
    // <. <=, ==, >=, >, != comparing operator
    double d1 = 10.234;
    double d2 = -7.346;
    double d3 = 10.234;
    
    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);

    System.out.println("d1 < d2 -> " + (d1 < d2));
    System.out.println("d1 <= d2 -> " + (d1 <= d2));
    System.out.println("d1 == d2 -> " + (d1 == d2));
    System.out.println("d1 >= d2 -> " + (d1 >= d2));
    System.out.println("d1 > d2 -> " + (d1 > d2));
    System.out.println("d1 != d2 -> " + (d1 != d2));
    System.out.println();

    System.out.println("d1 = " + d1);
    System.out.println("d3 = " + d3);
    System.out.println("d1 < d3 -> " + (d1 < d3));
    System.out.println("d1 <= d3 -> " + (d1 <= d3));
    System.out.println("d1 == d3 -> " + (d1 == d3));
    System.out.println("d1 >= d3 -> " + (d1 >= d3));
    System.out.println("d1 > d3 -> " + (d1 > d3));
    System.out.println("d1 != d3 -> " + (d1 != d3));
    System.out.println();

    // Ternary operator
    System.out.println("Ternary operator \" = ? : \"");
    boolean isVIP = true;
    System.out.println("isVIP = " + isVIP);
    System.out.println("String seatClass = isVIP ? \"First class\" : \"Econmomy class\";");
    String seatClass = isVIP ? "First class" : "Economy class";
    System.out.println("seatClass = " + seatClass);

    System.out.println();
    isVIP = false;
    System.out.println("isVIP = " + isVIP);
    System.out.println("String seatClass = isVIP != true ? \"Economy class\" : \"First class\";");
    seatClass = isVIP != true ? "Economy class" : "First class";
    System.out.println("seatClass = " + seatClass);

  }
  
}
