// <T> explains the scope of T. -> (No scope = Object class)
// <T> equivalents to <T extends Object>
// restrict the scope of generic type by using "extends"
// public class Bag<T extends Object> {}
public class Bag<T> {

  T thing;

  //
  public static <T> T get(T t) {
    return t;
  }

  public T eat(T value) {
    return value;
  }

  public static void main(String[] args) {
    Bag<Integer> bag = new Bag<>();
    Bag<Long> bag2 = new Bag<>();
    Bag<String> bag3 = new Bag<>();

    System.out.println(Bag.get(1L)); // calling static method
    System.out.println(Bag.get(2.0f)); // calling static method

    System.out.println();

    System.out.println(bag3.get("Hello World!"));
    System.out.println(bag.eat(1));

  }


}
