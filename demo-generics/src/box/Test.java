package box;

public class Test<T> extends Box<T> {

  T t;

  public static void main(String[] args) {
    Test<String> test = new Test<>();
    String o = test.t;

    // public class Test extends Box<T> {} -> Not OK
    // public class Test extends Box<String> {} -> OK
    // public class Test<T> extends Box<T> -> OK, but not good practise. easy to cause error
    // public class Test<U> extends Box<T> -> Not OK, since T could never be specified
  }
  
}
