public class DemoMethod {

  // main     -> method name
  // public (or private)    -> public: can be used outside class, private: can only be used inside class
  // static                 -> static: static method = method can be used without instantiate an object (class method)
  // void                   -> void: no return type

  public static void main(String[] args) {
    
    // javac -> compile comands, converting .java -> .class
    // java -> run .class file

    int x1 = 2;
    int x2 = 10;
    x1 *= 2;     // x = x * 2 = 4
    x1 += x2;     // x = x + y = 4 + 10 = 14
    System.out.println("x = " + x1);

    // change y value, and calculate again
    x1 = 2;
    x2 = 100;
    x1 *= 2;     // x = x * 2 = 4
    x1 += x2;     // x = x + y = 4 + 100 = 104
    System.out.println("x = " + x1);

    x1 = 2;
    x2 = 100;
    // trigger method
    System.out.println("x1 = " + x1 + ", x2 = " + x2);
    int result1 = sum(x1, x2);
    System.out.println(result1);              // 102
//    System.out.println(sum(x, y));            // 102
    System.out.println(substract(x1, x2));      // -98;
    System.out.println(multiply(x1, x2));       // 200
    System.out.println(divide(x1, x2));         // 0.02 double / int -> double; int/int -> int
    
    x1 = 123;
    x2 = -23;
    int x3 = 1;

    double d1 = 0.1d;
    double d2 = 0.2d;

    System.out.println(sum(x1, x2, x3));        // 123 + (-23) + 1 = 101
    System.out.println(sum('a', 'b', 'c'));     // 97 + 98 + 99
    System.out.println(sum(x1, x2, 'c'));     // 123 + (-23) + 99 = 199 
    System.out.println(sum(d1, d2));          // 2.3 + 2.5 = 4.8
  }

  // int x, int y are parameters as input of method
  // return type: int (sum is int)
  // f(x1, x2) = x1 + x2;
  public static int sum(int x1, int x2) {
    int sum = x1 + x2;
    return sum;
  }
  
  public static double sum(double x1, double x2) {
    double sum = x1 + x2;
    return sum;
  }
  // signature: (int x1, int x2, int x3)
  public static int sum(int x1, int x2, int x3) {
    return x1 + x2 + x3;
  }

  // signature: (char c1, char c2, char c3)
  public static int sum(char c1, char c2, char c3) {
    return c1 + c2 + c3;
  }

  // signature: (int x1, int x2, char c3)
  public static int sum(int x1, int x2, char c3) {
    return x1 + x2 + c3;
  }


  // int x, int y are parameters as input of method
  // return type: int 
  // f(x1, x2) = x1 - x2;
  public static int substract(int x1, int x2) {
    int difference = x1 - x2;
    return difference;
  }

  public static int multiply(int x1, int x2) {
    int product = x1 * x2;
    return product;
  }
  
  public static double divide(int x1, int x2) {
    double quotient = (double) x1 / x2;
    return quotient;
  }

}
