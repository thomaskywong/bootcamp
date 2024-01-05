// Please complete ClassA.java
public class ClassA {
    // 1
    public static final int SOME_NUMBER = initSomeNum();
    public static int someOtherNumber = 99;
    // 2
    public final String someString = initSomeString();
  
    // 1.2
    // one static initialization block to print Something here
    static {
        System.out.println("[Class A] Calling private static initialization block");
    }
  
    // 2.2
    // initialization block to print Something here
    {
        System.out.println("[Class A] Calling initialization block");
    }

    // 1.1
    // one static Method initSomeNum() return int 0, print Something here
    private static int initSomeNum(){
        System.out.println("[Class A] Calling private static method");
        return 0;
    }
  
    // 2.1
    // Instance Method initSomeString() return String and print something here
    private String initSomeString() {
        System.err.println("[Class A] Calling private method");
        return "String";
    }
  
    // A Constructor for ClassA to print something here
    public ClassA(){
        System.out.println("[Class A] Calling constructor");
    }

  
  }
