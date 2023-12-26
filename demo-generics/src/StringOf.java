public class StringOf<T extends Number> {

  private T value;

  public StringOf(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public String stringOf() {
    return "String: ".concat(String.valueOf(this.value));
  }

  public static void main(String[] args) {

    StringOf<Integer> integerToString = new StringOf<>(10);
    System.out.println(integerToString.stringOf());

    StringOf<Long> longToString = new StringOf<>(200L);
    System.out.println(longToString.stringOf());

    // StringOf<String> stringToString = new StringOf<>("Hello World");
    // System.out.println(stringToString.stringOf());

    StringOf<Double> doubleToString = new StringOf<>(12.032d);
    System.out.println(doubleToString.stringOf());

    StringOf<Float> floatToString = new StringOf<>(2312.24f);
    System.out.println(floatToString.stringOf());

    StringOf<Byte> byteToString = new StringOf<>((byte) 12);
    System.out.println(byteToString.stringOf());

    StringOf<Short> shortToString = new StringOf<>((short) 127);
    System.out.println(shortToString.stringOf());

    // StringOf<Boolean> booleanToString = new StringOf<>(true);
    // System.out.println(booleanToString.stringOf());



  }



}
